SELECT titles.title, COUNT(*) AS "Number Of Employees"
FROM titles
JOIN employees ON employees.emp_no = titles.emp_no
WHERE employees.birth_date > "1965-01-01"
GROUP BY titles.title;

SELECT titles.title, AVG(salary)
FROM titles
JOIN salaries ON titles.emp_no = salaries.emp_no
GROUP BY titles.title;

SELECT departments.dept_no, departments.dept_name, SUM(salary) 
FROM departments
INNER JOIN dept_emp ON departments.dept_no = dept_emp.dept_no
INNER JOIN salaries ON dept_emp.emp_no = salaries.emp_no
WHERE departments.dept_name IN ("Marketing") AND salaries.from_date >= "1990-01-01" AND salaries.to_date <= "1992-12-31";