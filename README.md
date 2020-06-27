# Employment-Management-System
## Angular-SpringBoot-CRUD-Project
This is a single page application using Angular as a front-end and Spring boot restful API as a backend.

REST API: This is used to develop CRUD RESTFul APIs for a simple Employee Management System using Spring Boot 2, JPA and MySQL as a database.
angular-springboot-client: This is used to develop single page application using Angular as front-end technology. This Angular application consumes CRUD Restful APIs developed and exposed by a employee management
project.

Server-side technologies

Spring Boot - 2
JDK - 1.8 or later
Spring Framework
Hibernate
Spring Data JPA

commands-: 
Inside restAPI start spring boot application.

Front end technologies

Angular
Bootstrap 4
npm- 6.9.0

commands-:npm install,  ng serve -o
```
Database:mysql

CREATE TABLE employees
(
  id int NOT NULL AUTO_INCREMENT,
  first_name varchar(255) NOT NULL,
  last_name varchar(255) NOT NULL,
  email_address varchar(255) NOT NULL,
  job_name varchar(255) NOT NULL,
  dep_name varchar(255) NOT NULL,
  salary_scale varchar(255) NOT NULL,
  PRIMARY KEY (id)
); 
```
