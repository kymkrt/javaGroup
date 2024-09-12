/*테이블 보여주기*/
show tables;/*테이블 보여주기*/
/* ddl*/
create table test(  /* 이것도 주석 가능하면 괄호안에 들어갈때 이런식으로 써라(이렇게 안하면 오류 날때 있음)*/
	name varchar(30) not null, /*성명*/
	age int default 20, /*나이*/
	gender char(2) default '여자', /*성별*/
	address varchar(10) /*주소*/
);

desc test;/*생성된 테이블의 구조 보기*/

drop table test; /*테이블 삭제처리*/
delete from test; /*test 테이블의 모든 레코드를 삭제합니다*/
/*dml*/
insert into test (name, age, gender, address) values ('홍길동', 23,'남자','서울'); /*레코드 삽입*/
insert into test values ('김말숙', 30,'여자','청주'); 
insert into test values ('오하늘', default, default,''); 
insert into test(name) values ('이사랑'); /*not null만 무조건 이부분 블록처리해서altx 하면 처리안된다 /**/ 해야됨 */
insert into test values ('가나다', 30,'여자','청주'); 
insert into test values ('아톰', 10,'남자','서울'); 
insert into test values ('강감찬', 20,'여자','광주'); 
insert into test values ('이사랑', 5,'여자','대구'); 
insert into test values ('강수연', 70,'여자','청주'); 
insert into test values ('고릴라', 56,'남자','청주'); 
insert into test values ('김감자', 100,'남자','조치원'); 
insert into test values ('이자바', 9999,'여자','청주'); 
insert into test values ('오로지', 40,'여자','청주'); 
insert into test values ('김자월', 30,'여자','제주'); 
insert into test values ('오자월', 22,'여자','제주'); 
insert into test values ('오이자월', 29,'여자','청주'); 
insert into test values ('김자월하', 36,'여자','청주'); 


update test set age=35; /*모든 age가 35로 됨*/
update test set age=5 where name = '김말숙';
update test set address='제주' where name = '김말숙';


select * from test; /*테이블 내용 보기*/

/*서울에 사는 사람들 조회*/
select * from test where address = '서울';

/*남자만 조회*/
select * from test where gender = '남자';

/*나이가 35세 이상만 조회*/
select * from test where age >= 35; /*=이거 붙이던 띄우던 괜찮다*/

/*서울에 사는 남자*/
select * from test where gender='남자'and address = '서울';

/*25세이상인 여자*/
select * from test where age>=25 and gender='여자';

/*서울에 살거나 청주에 거주하는 사람*/
select * from test where address ='서울' or address = '청주';

/*여자중에서 서울에 살거나 청주에 거주하는 사람*/
select * from test where (address ='서울' or address = '청주') and  gender ='여자';

/*여자 20대중에서 서울에 살거나 청주에 거주하는 사람*/
select * from test where (address ='서울' or address = '청주') and gender ='여자' and (age>=20 and age<30);

/*30대를 출력하세요*/
select * from test where age>=30 and age<40;
select*from test where age between 30 and 39; /*비트윈 앤드는 둘다 포함임 이상 이하*/

/*서울에 살거나 청주에 거주하는 사람*/
select*from test where address='서울' or address='청주';
select*from test where address in ('서울','청주');
select*from test where address in ('서','청');/*위하고 다름*/

/*성이 김씨인 사람만 출력*/
select*from test where name ='김*';/*어떤 프로그램은 이게 됨*/
select*from test where name like '김%';/*김으로 시작하는거*/

/*이름중에서 자로 끝나는 사람만 출력*/
select*from test where name like '%자'; -- 

/*이름중에서 '자'를 포함하는 사람들 모두 출력하세요*/
select*from test where name like '%자%';

/*이름중에서 2번째 글자가 '자'인 사람들 출력*/
select*from test where name like '_자%';/*밑줄하나당 한글자*/

/*서울이나 제주에 사는 사람들의 나이를 한살씩 증가*/
update test set age=age+1 where address ='서울'or address='청주';
update test set age=age+1 where address in ('서울','청주');

update test set age=age-1;/*모든 사람 한살 감소 이런 실수 많음 조심*/

/*청주에 사는 남자들을 삭제 처리*/
delete from test where address='청주' and gender ='남자';
select*from test where address='청주';

/*서울에 사는 사람들의 '성명/나이/성별'만 출력*/
select name,age,gender from test where address='서울';

/*이름순으로 오름차순 이거 없이 하면 입력순*/
select*from test order by name;
select*from test order by name desc;

/*나이 내림차순으로 출력하되 나이가 같으면 이름 오름차순으로 출력*/
select * from test order by age desc, name;