First hand on Spring Boot, hoping to complete the tutorial ASAP.

<h2><b>Annotations Learnt:</b></h2>
<br>
<br><b>@SpringBootApplication</b> :- Use if for the Class that holds the main method.
<br><b>@RestController</b> :- Use it for Controller Class.
<br><b>@RequestMapping("/subdirectory-name")</b> :- Use it for the controller class if the entire class is used to return * only one type of response.
<br><b>@Service</b> :- Use it for Service Class.
<br><b>@GetMapping("/subdirectory-name")</b> :- Use it on the method that returns the desired response.
<br>
<br>
<h2><b>Postgress Commands:</b></h2>
<br> <b>\l</b> :- Displays a list of databases present in Postgress
<br> <b>\! cls</b> :- Clears the screen
<br> <b>CREATE DATABASE database-name;</b> :- Creates a new database
<br> <b>\du</b> :- Displays a list of roles
<br> <b>CREATE ROLE role_name WITH LOGIN PASSWORD 'xxxx' SUPERUSER CREATEDB CREATEROLE;</b> :- Creats a new role with a new LOGIN and PASSWORD who is a super user and can create a new database and even create new roles.
<br> <b>DROP ROLE role_name</b> :- Deletes the specified role.
<br> <b>GRANT ALL PRIVILEGES ON "student" TO iamraajkanchan;</b>
<br> <b>\c database-name role-name</b> Connects the screen to a database name with a particular role. Note if you have set a password, then the PostgressSQL will ask the password to continue.
<br>
<br>
<br> $${\color{red}Note: don't forget to add ';' at the end of an PostgressSQL command}$$
