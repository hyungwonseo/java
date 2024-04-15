-- 제약조건
/* 데이터베이스에는 무결점의 데이터가 필수(= 무결성의 원칙).
테이블에 아무런 제약사항을 두지 않으면 적합하지 않은 데이터가 저장되고
그렇게되면 무결성의 원칙에 위배됨!!
그러므로 반드시 제약조건을 설정해야 함 */

create database project2 
	char set utf8mb4 collate utf8mb4_general_ci;
use project2;

/* 제약조건의 종류
primary key : 기본키
not null : 반드시 값이 필수
unique : 반드시 유일한 값
check : 설정된 조건에 맞는 값만 저장 가능
default : 값을 넣지 않으면 자동으로 기본값 저장
foreign key : 외래키 */

create table 학과
(학과번호 char(2) primary key,
학과명 varchar(20) not null,
학과장명 varchar(20));

create table 학생
(학번 char(5) primary key,
이름 varchar(20) not null,
생일 date not null,
연락처 varchar(20) unique,
성별 char(1) not null check(성별 in ('남','여')),
등록일 date default(curdate())
);

create table 과목
(과목번호 char(5) primary key,
과목명 varchar(20) not null,
학점 int not null check(학점 between 2 and 4),
구분 varchar(20) not null check(구분 in('전공','교양','일반')));

create table 영화
(영화번호 char(5) primary key,
타이틀 varchar(100) not null,
장르 varchar(20) check(장르 in 
		('코미디','드라마','다큐','SF','액션','역사','기타')),
배우 varchar(100) not null,
감독 varchar(50) not null,
제작사 varchar(50) not null,
개봉일 date,
등록일 date default(curdate()));
)

/* 번호 숫자형 일련번호 자동입력(auto_increment) 
평가자닉네임 가변문자형50자 필수입력
영화번호 고정문자형5자 필수입력, 영화테이블의 영화번호 참조
평점 숫자형 필수입력, 1~5사이
평가 가변문자형2000자 필수입력
등록일 날짜형 오늘날짜자동입력 */
CREATE TABLE 평점
(번호 INT AUTO_INCREMENT PRIMARY KEY,
평가자닉네임 VARCHAR(50) NOT NULL,
영화번호 CHAR(5) NOT NULL REFERENCES 영화(영화번호),
평점 INT NOT NULL CHECK(평점 BETWEEN 1 AND 5),
평가 VARCHAR(2000) NOT NULL,
등록일 DATE DEFAULT (CURDATE()));










