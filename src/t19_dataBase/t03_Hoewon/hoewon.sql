show tables;

create table hoewon(
	idx int not null auto_increment primary key, /*회원의 고유번호*/
	name varchar(30) not null, 			/*이름*/
	age int default 20,  /*나이*/
	gender char(2) default '여자', /*성별*/
	joinday datetime default now(), /*now: 날짜를 안넣으면 기본으로들어감 (yyyy-MM-dd) 가입일*/
	address varchar(20)	
);

desc hoewon;
--drop table hoewon;
--delete from hoewon;

insert into hoewon (name, age, gender, address) values ('홍길동', 23,'남자','서울'); /*레코드 삽입*/
insert into hoewon values (default,'김말숙', 30,'여자',default,'청주'); 
insert into hoewon values (default,'오하늘', default, default,default,''); 
insert into hoewon(name) values ('이사랑'); /*not null만 무조건 이부분 블록처리해서altx 하면 처리안된다 /**/ 해야됨 */
insert into hoewon values (default,'가나다', 30,'여자','2000-1-5','청주'); 
insert into hoewon values (default,'아톰', 10,'남자','1999-10-25','서울'); 
insert into hoewon values (default,'강감찬', 20,'여자','2005-05-07','광주'); 
insert into hoewon values (default,'이사랑', 5,'여자','2020-5-2','대구'); 
insert into hoewon values (default,'강수연', 70,'여자',default,'청주'); 
insert into hoewon values (default,'고릴라', 56,'남자','2024-4-3','청주'); 
insert into hoewon values (default,'김감자', 100,'남자',default,'조치원'); 
insert into hoewon values (default,'이자바', 9999,'여자','1995-8-20','청주'); 
insert into hoewon values (default,'오로지', 40,'여자',default,'청주'); 
insert into hoewon values (default,'김자월', 30,'여자','1234-05-9','제주'); 
insert into hoewon values (default,'오자월', 22,'여자',default,'제주'); 
insert into hoewon values (default,'오이자월', 29,'여자','2030-10-12','청주'); 
insert into hoewon values (default,'김자월하', 36,'여자','2032-12-12','청주'); 

select* from hoewon;
