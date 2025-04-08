create database tusherdb;
use tusherdb;
create table emp(
id int,
name varchar(50),
city varchar(50),
salary int
);

insert into emp (id,name,city,salary) values(
101,'tusher','dhaka',20000
);

select *from emp;

insert into emp (id,name,city,salary) values(
105,'hasan','AAA',30000
);

select id,name from emp;

select distinct city from emp;

select *
from emp 
where salary>=20000;

select *from emp order by salary desc;

select *from emp where city='dhaka' and salary=20000;

select *from emp where city in ('dhaka','aaa');

select *from emp where salary between 15000 and 20000;

select *from emp;

select *from emp where city like 'd%';

select *from emp where name like '%n';

select *from emp where name like '_r%'

select max(salary) as result from emp;

select min(salary) as result from emp;

select sum (salary)from emp;

select *from emp;

select max(salary) from emp where salary <(select max(salary) from emp);

select min(salary)from emp where salary >(select min(salary)from emp);