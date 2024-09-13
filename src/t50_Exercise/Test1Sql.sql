show databases;

show tables;

create table test1(  /* 이것도 주석 가능하면 괄호안에 들어갈때 이런식으로 써라(이렇게 안하면 오류 날때 있음)*/
	name varchar(30) not null, /*성명*/
	age int default 20, /*나이*/
	gender char(2) default '여자', /*성별*/
	address varchar(10) /*주소*/
);

select * from test1;

desc test;
/*생성된 테이블의 구조 보기*/

insert into test (name, age, gender, address) values ('홍길동', 23,'남자','서울'); /*레코드 삽입*/
insert into test values ('김말숙', 30,'여자','청주'); 
insert into test values ('오하늘', default, default,''); 
insert into test(name) values ('이사랑'); /*not null만 무조건 이부분 블록처리해서altx 하면 처리안된다 /**/ 해야됨 */
insert into test values ('가나다', 30,'여자','청주'); 
insert into test values ('아톰', 10,'남자','서울'); 