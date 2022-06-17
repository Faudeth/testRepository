select * from employees where birth_date < '1965-01-01';

select * from employees where gender = 'f' and hire_date > '1991-01-01';

select first_name, last_name from employees where last_name like 'f%' limit 50;

insert into employees values (100, '1974-04-03', 'Jeremy', 'Smith', 'M', '2012-14-02'),
			     (101, '1983-05-18', 'Molly', 'Jones', 'F', '2004-02-19'),
			     (102, '1996-06-11', 'Greg', 'Thompson', 'M', '2016-17-03');

update employees set first_name = 'Bob' where emp_no = 10023;

update employees set hire_date = '2002-01-01' where first_name like 'p%';

delete from employees where emp_no < 10000;

delete from employees where emp_no = 10048;
delete from employees where emp_no = 10099;
delete from employees where emp_no = 10234;
delete from employees where emp_no = 20089;
select * from employees where emp_no = 10048;
select * from employees where emp_no = 10099;
select * from employees where emp_no = 10234;
select * from employees where emp_no = 20089;