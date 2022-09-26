# Spring Boot를 이용한 Restful Web Service 개발

9/26
- start.spring.io에서 프로젝트 생성 및 dependency추가
  (SpringBoot DevTools, Lombok, Spring Web, Spring Data JPA, H2 Database 사용)


- 윈도우에서 사용자 폴더내 .으로 시작되는 폴더는 윈도우에서 히든파일로 관리하는 시스템 파일이며, springBoot로 추가한 dependency항목들은 .m2에서 관리한다.
(+예전에 이클립스에서 dependency오류가 났을때 .m2를 전부 삭제후 이클립스를 재실행 했을때 자동으로 dependency가 .m2에 추가됬던이유. spring관련은 org안에 생성)


- maven프로젝트일 경우 메이븐 설정파일을 pom.xml에서 관리함. (application.properties->설정이름=값)
- gradle프로젝트일 경우 build.gradle로 관리 (application.yml->설정이름:값)


- resources/application.properties에 스프링 실행에 필요한 설정 파일을 지정가능 .yml을 사용하기도함(바꾸는 이유는 추후 강의에서 언급예정)


- SpringBoot의 프로젝트일경우, 톰캣을 내장하고 있기에, WebApplication을 실행하면, 자동으로 톰캣 서버가 가동된다.


- 사용자로부터 uri호출시 http메소드(Get,post등)를 통해 클라이언트로부터 요청한 정보를 서버측에서 처리후 결과 메세지와 Status Code를 리턴.
- 예전에는 @RequestMapping("method=RequestMethod.GET", path="/url")처럼 전부 지정했지만, @GetMapping("url")처럼 지정가능.


- Lombok라이브러리 @Date -> getter,setter,toString @AllArgsConstructor -> 생성자. 인텔리J setting에서 enable Annotation Processiong활성화 후 사용
  (+Lombok라이브러리를 인텔리제이 내 플러그인을 추가해주어야 오류를 알려줌.)

  
- @ResController사용시 리턴값이 ResponseBody에 포함하지 않더라도 Json형태로 리턴한다.(Xml로 리턴리 라이브러리 추가)


- DispatcherServlet 역할
  - 클라이언트의 모든 요청을 한곳으로 받아서 처리
  - 요청에 맞는 Handler로 요청 전달
  - Handler의 실행 결과를 Http Response형태로 만들어서 반환


- @RestController
  - @Controller + @ResponseBody
  - view를 갖지 않는 REST Data(Json/Xml)을 반환


- @PathVariable
  - url파라미터에 ?key=value 형태가 아닌 /params 형태로 사용가능.
  - Mappping어노테이션안 path=/{name} 형태로 지정후, 해당 메서드의 파라미터에 @PathVariable 지정


- @RequestBody
  - http Post,put메서드시 클라이언트로부터 form데이터가 아닌 Json,xml같은 Object type을 받기 위해선 파라미터에 @RequestBody을 붙여야한다.


- RestApi 설계시, 단순하게 성공값200만을 리턴하는것이 아닌, Create시 201값을 보내는 것 처럼 해당 상태에 맞게 Status Code를 리턴하는것이 좋은 설계이며, 리턴Url도 생성하여 보낼수 있다.
- 해당 용도에 맞는Http Method(Get,Post,Delete,Put)을 사용하여야 한다.(Post로 다 떄려박아서 200ok리턴X)
- ServletUriComponentBuilder, ResponseEntity(주석 참고)
- @ResponseStatus()어노테이션을 이용해 httpStatus오류를 제어할수 있다








