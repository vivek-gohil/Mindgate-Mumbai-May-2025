-- DDL - Data Defination Language
DROP TABLE food;
CREATE TABLE food(
    food_id NUMBER(5),
    name VARCHAR2(50),
    category VARCHAR2(50),
    CONSTRAINT food_id_pk PRIMARY KEY(food_id)
);
INSERT INTO food VALUES(1,'Samosa','Veg');
INSERT INTO food VALUES(2,'Pav Bhaji','Veg');
INSERT INTO food VALUES(3,'Biryani','Non-Veg');

SELECT * FROM food;

DESC food;
DROP TABLE orders;
CREATE TABLE orders (
    order_id VARCHAR(5),
    quantity NUMBER(2),
    food_id NUMBER(5),
    CONSTRAINT order_id_pk PRIMARY KEY(order_id),
    CONSTRAINT food_id_fk FOREIGN KEY(food_id) REFERENCES food(food_id)
);

INSERT INTO orders VALUES('O001',2,1);
INSERT INTO orders VALUES('O002',1,2);
INSERT INTO orders VALUES('O003',1,3);
INSERT INTO orders VALUES('O004',1,2);

SELECT * FROM orders;

DESC orders;

-- Cross Join
SELECT * FROM food CROSS JOIN orders;

-- Inner Join
SELECT * FROM food f INNER JOIN orders o ON f.food_id = o.food_id;

-- Outer Join - Left Outer Join
SELECT * FROM food f LEFT OUTER JOIN orders o ON f.food_id = o.food_id;

-- Outer Join - Right Outer Join
SELECT * FROM food f RIGHT OUTER JOIN orders o ON f.food_id = o.food_id;

-- Outer Join - Full Outer Join
SELECT * FROM food f FULL OUTER JOIN orders o ON f.food_id = o.food_id;
DROP TABLE candidates;
CREATE TABLE candidates (
    candidate_id NUMBER(5),
    name VARCHAR2(50)
);

INSERT INTO candidates VALUES(1,'Komal');
INSERT INTO candidates VALUES(2,'Rasika');
INSERT INTO candidates VALUES(3,'Priyanka');
INSERT INTO candidates VALUES(4,'Priti');
INSERT INTO candidates VALUES(5,'Seema');

SELECT * FROM candidates;

CREATE TABLE employees (
    employee_id NUMBER(5),
    name VARCHAR2(50)
);
INSERT INTO employees VALUES(1,'Komal');
INSERT INTO employees VALUES(2,'Rasika');
INSERT INTO employees VALUES(3,'Priyanka');
INSERT INTO employees VALUES(4,'Priti');
INSERT INTO employees VALUES(5,'Reema');

SELECT * FROM employees;


-- Inner Join
SELECT * FROM candidates c INNER JOIN employees e ON c.name = e.name;

-- Outer Join - Left Outer
SELECT * FROM candidates c LEFT OUTER JOIN employees e ON c.name = e.name;

-- Outer Join - Right Outer
SELECT * FROM candidates c RIGHT OUTER JOIN employees e ON c.name = e.name;

-- Outer Join - Full Outer
SELECT * FROM candidates c FULL OUTER JOIN employees e ON c.name = e.name;


-- Self Join
CREATE TABLE employee_manager_details(
    employee_id VARCHAR2(10),
    name VARCHAR2(50),
    salary NUMBER(9),
    manager_id VARCHAR2(10)
);

INSERT INTO employee_manager_details VALUES('E101','Pranay',50000,NULL);
INSERT INTO employee_manager_details VALUES('E102','Harsh',50000,'E101');
INSERT INTO employee_manager_details VALUES('E103','Amey',50000,'E101');
INSERT INTO employee_manager_details VALUES('E104','Prathamesh',50000,'E102');

SELECT * FROM employee_manager_details;

SELECT * FROM employee_manager_details e INNER JOIN employee_manager_details m ON e.manager_id = m.employee_id;

SELECT e.employee_id,e.name,m.name AS Manager_Name
FROM employee_manager_details e INNER JOIN employee_manager_details m ON e.manager_id = m.employee_id;


CREATE TABLE employee_details (
    employee_id VARCHAR2(10),
    first_name VARCHAR2(50),
    last_name VARCHAR2(50),
    gender VARCHAR2(6),
    salary NUMBER(8,2),
    city VARCHAR2(50),
    state VARCHAR2(50),
    date_of_birth DATE
);

INSERT INTO employee_details VALUES ('MGS5183', 'Prathamesh', 'Zingade', 'Male', 60000, 'Thane', 'Maharashtra', '12-Nov-2002');
INSERT INTO employee_details VALUES('MGS551', 'Amey', 'Pote', 'Male', 27000, 'Wardha', 'Maharashtra', '04-Mar-2001');
INSERT INTO employee_details VALUES('MGS5179','Pawan','Singh','Male',30000,'Thane','Maharashtra','30-Nov-2003');
insert into employee_details values('MGS5186', 'Sarvesh', 'Kulkarni', 'Male', 50000, 'Pune', 'Maharashtra', '09-Dec-2001');
INSERT INTO employee_details VALUES('MGS5182', 'Pranay', 'Ughade', 'Male', 90000, 'Nagpur', 'Maharashtra', '28-May-2002');
INSERT INTO employee_details VALUES('MGS5175','Komal','Chaudhari','Female',30000,'Jalgaon','Maharashtra','13-JUN-2002');
INSERT INTO employee_details VALUES ('MGS5180','Priti','Molawade','Female',75000,'Navi Mumbai','Maharashtra','06-March-2003');
insert into employee_details values('MGS5170','Abhishek','Mahadik','MALE',30000,'Kalyan','Maharashtra','25-JUL-2003');
INSERT INTO employee_details VALUES('MGS5184','Rasika','Patil','Female',30000,'Kolhapur','Maharastra','13-Feb-2003');
INSERT INTO employee_details VALUES('MGS5181','Priyanka','Bolaj','Female',60000,'Kharghar','Maharashtra','05-May-2002');
INSERT INTO employee_details VALUES('MGS5178' ,'Nitesh' , 'Kanojia' , 'Male' , 50000 , 'Mumbai' , 'Maharashtra' , '16-April-2003');
INSERT INTO employee_details VALUES('MGS5177','Mayuresh','Samant','Male',30000,'Navi Mumbai','Maharashtra','18-DEC-2001');
INSERT INTO employee_details VALUES ('MGS5173','Darshan','Zapda','Male',60000,'Jamnagar','Gujarat','29-July-2002');
INSERT INTO employee_details VALUES('MGS5174','HARSH','VERMA', 'MALE', 60000, 'Ulwe', 'Maharastra', '12-OCT-2002');
INSERT INTO employee_details VALUES ('MGS5185','Sahil','Gade','Male',100000,'khopoli','Maharashtra','05-May-2002');
INSERT INTO employee_details VALUES('MGS5187' ,'Saurav' , 'Gupta' , 'Male' , 50000 , 'Mumbai' , 'Maharashtra' , '29-Nov-2003');
INSERT INTO employee_details VALUES ('MGS5172','Avinash','Kharat','MALE',127550.75,'Ambarnath','Maharashtra','03-Apr-2001');

SELECT * FROM employee_details;
SELECT employee_id,first_name,last_name,salary FROM employee_details;
SELECT * FROM employee_details WHERE gender  = 'Male';
SELECT * FROM employee_details WHERE gender  = 'Female';
SELECT * FROM employee_details WHERE gender  = 'Male' AND city = 'Mumbai';
SELECT * FROM employee_details WHERE gender  = 'Female' AND city = 'Navi Mumbai';
SELECT * FROM employee_details WHERE city = 'Thane' OR city = 'Mumbai' OR  city = 'Navi Mumbai';
SELECT * FROM employee_details WHERE city IN ('Thane','Mumbai','Navi Mumbai');
SELECT * FROM employee_details ORDER BY first_name;
SELECT * FROM employee_details ORDER BY first_name DESC;
SELECT city,first_name FROM employee_details;
SELECT city,first_name FROM employee_details ORDER BY city , first_name;
SELECT COUNT(gender) FROM employee_details WHERE gender IN ('Male' ,'MALE');
SELECT COUNT(gender) FROM employee_details WHERE gender IN ('Female');
SELECT COUNT(gender) FROM employee_details WHERE gender IN ('Male' ,'MALE') AND city = 'Mumbai' ;
SELECT COUNT(gender) , city  FROM employee_details WHERE gender IN ('Male' , 'MALE') GROUP BY city;
SELECT city , COUNT(city)  FROM employee_details GROUP BY city ORDER BY city;
SELECT salary , COUNT(salary) FROM employee_details GROUP BY salary ORDER BY COUNT(salary) DESC;
SELECT salary , COUNT(salary) FROM employee_details GROUP BY salary ORDER BY salary;
SELECT salary , COUNT(salary) FROM employee_details GROUP BY salary ORDER BY salary;
SELECT salary , COUNT(salary) FROM employee_details WHERE salary >= 50000 GROUP BY salary ORDER BY salary;
SELECT city , COUNT(city)  FROM employee_details GROUP BY city HAVING count(city) > 1  ORDER BY city;

-- Costraints 
-- Primary Key , Foreign Key , Not Null , Check , Unique , Default

DROP TABLE employee_details;

CREATE TABLE employee_details (
    employee_id NUMBER(5),
    first_name VARCHAR2(50) NOT NULL,
    last_name VARCHAR2(50) NOT NULL,
    email VARCHAR(50),
    salary NUMBER(8,2),
    city VARCHAR2(50) DEFAULT 'Mumbai',
    CONSTRAINT employee_id_pk PRIMARY KEY(employee_id),
    CONSTRAINT email_uq UNIQUE(email),
    CONSTRAINT salary_ck CHECK(salary > 0)
);

INSERT INTO employee_details VALUES (101,'Test First 1','Test Last 1','test101@test.com',5000,'Pune');
INSERT INTO employee_details VALUES (102,'Test First 2','Test Last 2','test102@test.com',3000,DEFAULT);
INSERT INTO employee_details(employee_id,first_name,last_name,email,salary) 
VALUES (103,'Test First 3','Test Last 3','test103@test.com',3000);

INSERT INTO employee_details VALUES (104,'Test First 4','Test Last 4','test104@test.com',3000,DEFAULT);
INSERT INTO employee_details VALUES (105,'Test First 5','Test Last 5',NULL);

SELECT * FROM employee_details;

SELECT * FROM user_tables;
SELECT * FROM user_constraints;

ALTER TABLE employee_details 
DROP CONSTRAINT SYS_C0013122;

DELETE employee_details WHERE employee_id IS NULL;
DELETE employee_details WHERE employee_id = 103;

ALTER TABLE employee_details 
ADD CONSTRAINT employee_id_pk PRIMARY KEY(employee_id);

SELECT * FROM employee_details;

CREATE OR REPLACE VIEW vi_employee_details
AS
    SELECT employee_id,first_name,last_name,salary FROM employee_details WITH READ ONLY;
    
SELECT * FROM vi_employee_details;

UPDATE vi_employee_details SET salary = 5000 WHERE employee_id = 102;

SELECT * FROM employee_details;


SELECT * FROM user_indexes;

CREATE INDEX ix_salary ON employee_details(salary);

DROP INDEX ix_salary;

-- CREATE UNIQUE INDEX ix_salary ON employee_details(salary);

-- Pending
-- Stored Procedures 
-- Triggers 




















