## Building Rest Api with Spring Boot, Spring Security & JWT

### Tutorials

1. **Clone the application**
    ```bash
	git clone https://github.com/r4lly99/shopping.git
	cd shopping
	```
	
2. **Create MySQL database**

	```bash
	create database shoppingdb
	```

3. **Change MySQL username and password as per your MySQL installation**

	+ open `src/main/resources/application.properties` file.

	+ change `spring.datasource.username` and `spring.datasource.password` properties as per your mysql installation

4. **Run the app**

	You can run the spring boot app by typing the following command -

	```bash
	mvn spring-boot:run
	```

	The server will start on port 8080.

	You can also package the application in the form of a `jar` file and then run it like so -

	```bash
	mvn package
	java -jar target/shopping-0.0.1-SNAPSHOT.jar
	```
5. **Default Roles**
	
	The spring boot app uses role based authorization powered by spring security. To add the default roles in the database, I have added the following sql queries in `src/main/resources/data.sql` file. Spring boot will automatically execute this script on startup -

	```sql
	INSERT IGNORE INTO roles(name) VALUES('ROLE_USER');
	```

	Any new user who signs up to the app is assigned the `ROLE_USER` by default.	

---
    credit for @rajeevkumarsingh for security package and how to implement JWT