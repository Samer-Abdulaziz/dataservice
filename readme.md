# Introduction
This quick example using Spring boot, JPA, Hibernat and MySql to have rest service CURD operations

# what you will need to get this app working 

+ Install MySql
+ Java 1.8
+ [Maven] (https://docs.wso2.com/display/IS323/Installing+Apache+Maven+on+Windows)
+ posman for doing the api calls 

# Create Database using workbanch 
```
create database notes_app;
```
\
![alt text](screenshots/db_run.png "shows how to create DB from Workbanch")

# CURD Operations and APIs

+ GET /api/notes\
![alt text](screenshots/getall.png "shows how get all works")
+ POST /api/notes\
![alt text](screenshots/post.png "shows how to create new record in the database")
+ GET /api/notes/{noteId}\
![alt text](screenshots/getone.png "shows how to get one record from database by Id")
+ PUT /api/notes/{noteId}\
![alt text](screenshots/update.png "shows how to update one record in the database")
+ DELETE /api/notes/{noteId}\
![alt text](screenshots/delete.png "shows how delete one record from the database")

