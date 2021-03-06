# Spring Security Practice Project

## 2020-11-16

- 시큐리티 기본 로그인 폼을 커스텀 로그인 폼으로 변경(부트스트랩)


## 2020-11-19

- 회원가입 폼 추가 및 UI 변경
- 회원가입 구현. 비밀번호 Bcrypt로 암호화
- CustomAuthenticationProvider으로 DB 연동 인증처리(로그인 기능)

<img src="https://user-images.githubusercontent.com/73692337/99662056-1af3f500-2aa8-11eb-98a0-b9cccf99cbee.JPG" width="50%" height="50%">

- 로그아웃 구현
- 로그인 시 ID, Password 외 Secret Key 파라미터로 추가로 전송

## 2020-11-20

- 게시글 작성 기능 추가
- 게시글 리스트 UI 구현(boardList, 기능은 미완성)

- CustomSuccessHandler 추가. 
  (로그인 이전에 권한이 필요한 URL 접속 시 로그인 창으로 이동 후 인증 성공 시 해당 URL로 바로 리다이렉트)
  
- CustomFailureHandler 추가
  (username 이나 password 값에 따라서 경고문 Login Form에 출력)

<img src="https://user-images.githubusercontent.com/73692337/99804271-1568de80-2b7e-11eb-8349-4c182611acee.JPG" width="50%" height="50%">


## 2020-11-21

- Custom Access Deny 구현

- Ajax 로그인, SuccessHandler, FailureHandler 기능 테스트
- Ajax 기능 테스트 후 비활성화(다시 Form 방식으로)


## 2020-11-25
<img src="https://user-images.githubusercontent.com/73692337/100188762-3c346580-2f2e-11eb-84eb-aa9dad878877.JPG" width="50%" height="50%">

- 게시판 목록 기능 추가
- SecurityContextHolder 이용, 작성자 아이디 로그인 한 사용자 아이디를 불러옴.


## 2020-11-27

<img src="https://user-images.githubusercontent.com/73692337/100424445-f663d280-30d0-11eb-99a0-fc32bc55bdc9.JPG" width="40%" height="30%">

- '인가'를 구현하기 위해 role, resources 도메인 추가
- role 엔티티는 resources와 member 다대다 매핑


## 2020-11-28

<img src="https://user-images.githubusercontent.com/73692337/100518695-6ad46980-31d6-11eb-9434-bb8d5039343a.JPG" width="50%" height="50%">

- 어드민 페이지에서 회원 목록 


## 2020-11-29

- 권한 관리, 리소스 관리 인터페이스 추가

## 2020-11-30

- DB 연동 인가를 위해 FilterInvocationSecurityMetaDataSource 클래스 구현
- 기능 미완성. 필터를 재설정 해줬기 때문에 Thymeleaf의 security 부분 전부 미작동

## 2020-12-01

- 뷰 페이지 thymeleaft security 태그 임시 삭제
- DB에서 Role Repository를 읽어오기 위한 FactoryBean 구현
