![eric-nopanen-EufBdG-ZQMs-unsplash](https://user-images.githubusercontent.com/95854933/165461000-ff57dc86-6f2f-47d8-89a1-0acce13fbc6c.jpg)

**This is a simple web application that simulates the work of a taxi service and supports authentication and interaction with the database.**

**Functional:**
- Display all Drivers
- Display all Cars
- Display All Current Cars
- Display all Manufacturers
- Create new Driver
- Create new Car
- Create new Manufacturer
- Add driver to car

**3-layer architecture:**
- DAO - Data access layer
- Service - Application layer
- Controllers - Presentation layer

**Technologies:**
- Java 17
- Apache Tomcat - version 9.0.50
- MySQL
- Servlet
- JSTL
- JSP


**How to start the program :**
1) Install MySQL and Apache Tomcat version 9.
2) Configure Apache Tomcat for your IDE.
3) Use "/resources/init_db.sql" for creating a schema and tables.
4) Configure "/util/ConnectionUtil.java" with your URL, USERNAME, PASSWORD, JDBC_DRIVER.
5) Change the relative path: "/logs/app.log" in the "resources/log4j2.xml" file with an absolute path.
6) Configure the tomcat library path in the startup settings.
