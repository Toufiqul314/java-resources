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

//// salary is greater than or equal to 20000
select *
from emp 
where salary>=20000;


select *from emp order by salary desc;
//// city is dhaka or salary is 20000
select *from emp where city='dhaka' and salary=20000;

select *from emp where city in ('dhaka','aaa');
// between salary 15000 and 20000
select *from emp where salary between 15000 and 20000;

select *from emp;
// name starts with 'd'
select *from emp where city like 'd%';
// name starts with 'n'
select *from emp where name like '%n';
// name ends with 'n'
select *from emp where name like '_r%'
// maximum salary
select max(salary) as result from emp;
//minmum salary
select min(salary) as result from emp;
// total sum of salary
select sum (salary)from emp;

select *from emp;

// 2nd highest salary
select max(salary) from emp where salary <(select max(salary) from emp);
// 2nd lowest salary
select min(salary)from emp where salary >(select min(salary)from emp);