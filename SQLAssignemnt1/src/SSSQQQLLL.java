//  Show all employees who were born before 1965-01-01
		SELECT * FROM employees WHERE birth_date < " 1965-01-01" Limit 20;
// Show all employees who are female and were hired after 1990
		SELECT * SELECT * FROM employees WHERE gender = "F" AND hire_date > "1990-12-31" 
// Show the first and last name of the first 50 employees whose last name starts with F
		SELECT first_name, last_name FROM employees WHERE last_name LIKE "F%" 
// Insert 3 new employees into the employees table. There emp_no should be 100, 101, and 102. You can choose the rest of the data.
		INSERT INTO employees VALUES
		(100, "1980-06-05", "ED", "Man", "M", "2001-01-04"),
		 (101, "1981-07-06", Cool", 'Kid', "M", "2002-02-05"),
		 (102, "1982-08-07", "Kool", "Quid", "M", "2003-03-06");
//	Change the employee's first name to Bob for the employee with the emp_no of 10023.
		 UPDATE employees SET first_name = "Bob" WHERE emp_no = 10023; 
// Change all employees hire dates to 2002-01-01 whose first or last names start with P.
		 UPDATE employees SET hire_date = "2002-01-01" WHERE first_name LIKE "P%" OR last_name LIKE "P%";
//	Delete all employees who have an emp_no less than 10000	
		 DELETE FROM employees WHERE emp_no < 10000;
//	Delete all employee who have an emp_no of 10048, 10099, 10234, and 20089.
		 DELETE FROM employees WHERE emp_no = 10048 OR emp_no = 10099 OR emp_no = 10234 OR emp_no = 20089;