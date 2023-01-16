# E16.1-Spring-Boot-Activity---Rest-API-with-JPA




# E16.1SpringBootActivity
E16.1 Spring Boot Activity - Rest API with JPA


I added a backup file for my database named it 'schoolDB.sql'


Heres the process on how to restore database on postgres using a backup file
//https://www.youtube.com/watch?v=GWx0Xw2A8AA

also in my application.propertie files
our credentials on postgres may be different so please change those credentials on my application.propeery files





ADD STUDENT
Http://localhost:8080/student/admin/addStudent?first_name=Gerard&last_name=way&email=mcr@Gmail.com&course=Major in Music&Gpa=1

GET ALL 
http://localhost:8080/student/user/getAllStudents

UPDATE 
Http://localhost:8080/student/admin/updateStudent?id=202&first_name=Gerard&last_name=way&email=mychemical@Gmail.com&course=Major in Music&Gpa=7777


DELETE
 Http://localhost:8080/student/admin/delete?id=1654


SEARCH BY ID

Http://localhost:8080/student/user/search?id=204
