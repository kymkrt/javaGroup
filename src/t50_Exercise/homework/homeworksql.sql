use sample;
create table hoewon(
	mid varchar(15) not null,
	pwd varchar(15) not null,
	name varchar(20) not null,
	age int default 20,
	sex varchar(2) default '남자',
	ipsail DATETIME DEFAULT NOW(),
	address varchar(50)
);
DESCRIBE hoewon;
select * from hoewon;

select *from hoewon where mid ='kim';
select *from hoewon where sex ='남자';
select *from hoewon where address ='서울';
select *from hoewon where address ='서울' and sex ='남자';

show tables;
selected * from hoewon;
drop table hoewon;

alter table sinsang rename to hoewon;

insert into hoewon values ('hong','1234','홍길동',25,default,'1990-10-05','서울'); 
insert into hoewon values ('kim','1234','김말숙',33,'여자','1997-12-3','부산'); 
insert into hoewon values ('lee','1234','이순자',24,'여자','1985-7-25','광주'); 
insert into hoewon values ('lee1','1234','이기자',40,'남자','1999-10-3','울산'); 
insert into hoewon values ('park','1234','박찬호',32,'남자','1980-6-08','대전'); 
insert into hoewon values ('bae','1234','배은숙',19,'여자','1993-11-22','마산'); 
insert into hoewon values ('son','1234','손기정',45,'남자','1987-12-15','제주'); 
insert into hoewon values ('kim1','1234','김영숙',36,'여자','2002-10-5','부천'); 
insert into hoewon values ('kim2','1234','김영철',39,'남자','1988-10-05','인천'); 
insert into hoewon values ('lee2','1234','이겨라',29,'남자','2000-10-09','서울'); 
insert into hoewon values ('son2','1234','손오공',23,'남자','2005-12-15','서울'); 

update hoewon set address = '서울' where mid ='kim1';

select mid, age, address from hoewon;

select mid as '아이디', sex as '성별', ipsail as '입사일' from hoewon where ipsail >= '2000-01-01';

insert into hoewon values ('park','1234','박세리',35,'여자',default,'인천'); 

select mid, age, sex, address from hoewon where (age >=30 or age>40) and sex='여자';

select * from hoewon where (age >=30 or age>40) and sex='여자';

select mid, age, sex, address from hoewon where age between 30 and 39 and sex = '여자';

select name, age, sex, address from hoewon where address in ('서울' , '부산');

select name, age, sex, address from hoewon where address ='서울' or address ='부산';

select * from hoewon order by age desc, name;

insert into hoewon values ('hkgj','1234','홍길공자',default,default,default,'서울'); 

select * from hoewon where name like '홍%';

select * from hoewon where name like '%자';

select * from hoewon where name like '%공%';

select mid as '아이디',name as '이름', sex as '성별' from hoewon where name like '_기%';

select * from hoewon where name like '%공_';

select mid as '아이디',name as '이름', sex as '성별' from hoewon limit 0, 5;

select mid, name, sex from hoewon limit 5, 5;

select mid, name, sex from hoewon order by sex desc, name limit 0, 5; 

select * from hoewon order by age desc limit 0, 3; 