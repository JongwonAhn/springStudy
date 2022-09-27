package com.example.restfulwebservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@RestController
public class UserController {

    private UserDaoService service;

    public UserController(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = service.findOne(id);

        if(user == null){
            throw new UserNotFoundException(String.format("Id[%s] is not Found", id));
        }

        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User savedUser = service.save(user);
        /**
         * ServletUriComponentsBuilder 클래스는 무슨 클래스인가?
         * -1. ServletUriComponentsBuilder는 사용자 요청에 따른 작업을 처리한 다음,
         * 결과 값을 토대로 관련 URI를 생성해 주는 역할을 하게 됩니다. 예를 들어,
         * 보기와 같이 /users 등록 작업을 요청했으니, 등록이 성공한 다음에는
         * 클라이언트에게 성공 여부와 상세정보 페이지에 대한 URI 값을 전달하기 위해 URI 객체를 생성하는데 사용됩니다.
         * 그리고 생성된 URI 객체는 클라이언트의 response header 또는 response body에 포함하여 전달하 수 있습니다.
         *
         * 2. ResponseEntity는 무슨 객체인가?
         * 2. ResponseEntity 반환 객체를 생성해 줍니다.
         * created() 메소드는 반환 객체에 대한 response 타입을 결정하는데,
         * created로 할 경우 201 코드를 반환해 줍니다. 201 코드는 POST 요청과 같이
         * 서버의 리소스를 추가했을 때에 대한 응답 코드이며,
         * 201 응답 코드를 클라이언트 단에서 받게 되면,
         * 정상 처리 되었다는 것을 알수 있게 됩니다.
         * 굳이 success: ok와 같은 형식의 데이터를 받아서 처리할 필요가 없게 됩니다.
         * 불필요한 네트워크 트래픽도 감소 됩니다.
         * 그리고 location의 URI 는 response header를 보면 참조할 수 있습니다.
         * 따라서, 클라이언트 단에서 POST 요청에 대한 성공을 인지한 다음,
         * 다음과 같은 주소를 확인하면, 상세정보 URI을 요청할 수도 있게 됩니다.
         */
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleUser(@PathVariable int id){
        User user = service.deleteById(id);

        if(user == null){
            throw new UserNotFoundException(String.format("ID[%s] not found", id));
        }
    }
}
