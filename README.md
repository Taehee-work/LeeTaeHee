## 파스타 클라우드에 MySQL용 스프링프로젝트 배포하기

***
### 파스타 클라우드 활용(공통)
1. 스프링프로젝트 LeeTaeHee_mysql 변경(도메인의 호스트네임으로 사용)
2. 이클립스에서  LeeTaeHee_mysql 프로젝트를 파스타에 배포 (Hsql 용)
3. LeeTaeHee_mysql 로컬 mysql서버와 연동처리
4. 파스타 클라우드에서 Mysql 서비스 생성(원격 접속 이름과 암호를 확인가능)
5. 원격 phpMyAdmin 툴(워크벤치와 비슷)을 파스타 클라우드에 PHP앱 생성후 배포
6. LeeTaeHee-mysql 프로젝트를 클라우드용 DB사용으로 변경후 파스타에 재배포
   http://LeeTaeHee-mysql.paas-ta.org
7. LeeTaeHee_egov 프로젝트명 변경: LeeTaeHee-egov 파스타에 배포(Mysql 클라우드 사용)
   http://egov-LeeTaeHee.paas-ta.org
***

### 2020-08-12(수) 작업내용(아래)

- 1. 어제한 작업내용 리뷰(아래)
	- 파스타 클라우드에 접속할 때, https://api.paas-ta.org 주소사용
	- RestAPI 서버가 https://api.paas-ta.org
	- RestAPI서버에 Json 데이터를 보내서, 앱을 생성하고 실행

```
매니페스트 야믈 파일(manifest.yml)

---
applications:
- name: LeeTaeHee-mysql
  memory: 1024M
  disk_quota: 1024M
  instances: 1
  host: leetaehee-mysql
  domain: paas-ta.org
```

- 2. LeeTaeHee-mysql 프로젝트를 Hsql -> MySQL 변경(아래)

```
1. root-context.xml 수정
2. wamp 실행후 프로젝트를 톰캣서버로 확인
```

- 3. 로컬에서 테스트 OK된 후 클라우드에서 MySQL서비스를 생성

```
1. 온라인 파스타 클라우드에서 LeeTaeHee-mysql-db 이름의 MySQL 서비스를 생성
2. 생성된 MySQL 서비스를 웹으로 제어하는 php 프로젝트를 이클립스로 Import(LeeTaeHee-myadmin 프로젝트명)
3. 아래 php프로젝트를 파스타에 푸시(manifest.yml사용): 클라우드파운더리 cf cli(커맨드라인인터페이스)
4.https://LeeTaeHee-myadmin.paas-ta.org 접속후 edu 데이터베이스 생성및 더미데이터 입력
```

- 4. 스프링 MySQL프로젝트를 로컬MySQL 설정 -> 클라우드 파스타용으로 변경

```
1. 메이븐 pom.xml 파일에 클라우드용 모듈 추가
2. root-context.xml 파일에 DB커넥션 설정을 클라우드용으로 추가
3. 작업결과확인 : 이클립스에서 파스타서버 더블클릭 -> Application and Service 탭에서 
	-> 오른쪽에 Update and Restart 버튼을 클릭해서 클라우드배포 - 수정사항 적용
```