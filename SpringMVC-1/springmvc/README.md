# SrpingMVC1

2022/10/26

@RestController
- @RestController는 반환값으로 뷰를 찾는것이 아니라 "Http 메세지 바디에 바로 입력한다."

@PathVariable
- GetMapping에서 동적인 url을 @PathVariable을 사용하여 매칭되는 부분을 편리하게 조회할수 있다.
- 다중으로 사용도 가능하다.

요청 파라미터 방식
@RequestParam
- 스프링이 제공하는 @RequestParam을 사용하면 요청 파라미터를 매우 편리하게 사용할수 있다.
- 파라미터 이름으로 바인딩 한다.
- HTTP 파라미터 이름이 변수 이름과 같으면 @RequestParam(name = "xx") 생략 가능
- String, int, Integer 등의 단순 타입일 경우 @RequestParam도 생략 가능
- (required = true) 로 파라미터 필수 여부를 설정할수 있다. 생략시 필수 true이다.
- (, defaultValue ="") 를 주어 없을때 디폴트 값을 넣어줄 수 있다.

@ModelAttribute
- @RequestParam이 아닌 @ModelAttribute를 사용하면 Model 객체가 생성되고, 요청 파라미터의 값도 모두 들어가 있다.
- 요청 파라미터의 이름으로 모델 객체의 프로퍼티를 찾고, 해당 프로퍼티의 setter를 호출해서 파라미터의 값을 입력(바인딩) 한다
- 타입이 맞지 않는 쿼리스트링값이 들어오면 BindException이 난다.(뒤 검증에서 다룰예정)
- @ModelAttribute자체 생략이 가능하다. 
- @RequestParam도 생략이 가능한데??
    - 스프링은 String, int, Integer같은 단순타입 -> @RequestParam
    - 나머지 -> @ModelAttribute (argument resolver로 지정해둔 타입외)

HTTP message body에 데이터를 직접 담아서 요청시
- 요청 파라미터와 다르게 HTTP 메세지 바디를 통해 데이터가 직접 넘어오는 경우는 @RequestParam, @ModelAttribute 를 사용할 수 없다.

HttpEntity
- HttpEntity, @RequestBody 를 사용하면 HTTP 메세지 컨버터가 HTTP메세지 바디의 내용을 우리가 원하는 문자나 객체 등으로 변환해준다
- HTTP header, body 정보를 편리하게 조회
- 메세지 바디 정보를 직접 조회
- 요청 파라미터를 조회하는 기능과는 관계 없음.
- 응답에도 사용 가능 (메세지 바디 정보 직접 반환, 헤더 정보 포함 가능)
- 요청에는 @RequestBody, 응답에는 @ResponseBody를 사용해 더 간편하게 사용이 가능하다.

요청파라미터 vs HTTP 메세지 바디 정리.
- 요청 파라미터를 조회하는 기능 : @RequestParam, @ModelAttribute
- HTTP메세지 바디를 직접 조회하는 기능 : @RequestBody

2022/10/27

뷰 템플릿
- 뷰 탬플릿을 거쳐 HTML이 생성되고, 뷰가 응답을 만들어서 전달한다.
- 일반적으로 HTML을 동적으로 생성하는 용도로 사용하지만, 다른 것들도 가능하다. 뷰 탬플릿이 만들수 있는것이라면 뭐든지 가능하다.
- 

