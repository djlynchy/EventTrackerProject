# EventTrackerProject
##OverView
This is a Reloading Recipe Database. The idea for this project is to have your favorite ammo reloading data on hand.

Results currently displays:

caliber
bullet brand, type, and weight
powder brand, type, and weight
primer brand and type


##REST API Endpoints
| HTTP Verb | URI                  | Request Body | Response Body |
|-----------|----------------------|--------------|---------------|
| GET       | `api/reload/search`  |              | JSON of `List<Reload>` |
| GET       | `api/reload/{id}`    |              | JSON of `reload`{id}  |
| POST      | `api/reload`         | JSON of a new `reload` | JSON of created `reload` |
| PUT       | `api/reload/{id}`    | JSON of a new version of `reload` {id} | JSON of updated `reload` |
| DELETE    | `api/results/{id}`   |              | |



##Technologies Used
Java
SQL / MySQL
C.R.U.D.
Spring Tool Suite
Spring Boot
Postman
REST
JPA
JUnit

##Lessons Learned

I gained a lot of experience for this project and the set up. I have a better grasp on mySQL and setting up a database.

I learned postman wasn't as easy as i thought, but when i finally saw it work for me, many of the lessons that were taught clicked.

Taking you time and making sure the correct annotations in each class and interface that need them. This can create major hang ups and the resulting fix is a simple annotation. spent more time than i should have because of that.
