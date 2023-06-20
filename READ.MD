## AuthorizationServer 와 ResourceServer 를 한 모듈에서 관리하여 토큰 발급 과 해당 토큰으로 api 호출

### 개선사항

* AuthorizationServer, ResourceServer 모듈 분리
    * 암호화 관련 키 관리
    * 발급한 토큰으로 api 호출
* clientRepository 관리 - jpa
* scope 관리 - 무차별 인증 성공


* 참고 https://tech.kakaopay.com/post/spring-oauth2-authorization-server-practice/