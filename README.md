# Example Web Service RESTful with Spring Boot
 The Contact_ListWS API ia an example of a RESTful services, using Maven and make a CRUD based REST service.
 
For this project was used following tools and technologies.

Java 1.8

STS 3.9.4.RELEASE

Spring Framework 2.0.3.RELEASE

Maven 4.0.0

POSTMan (optional)

## Method:
The REST application have Person resource. This person resource can be accessed using standard GET, POST, PUT, DELETE http methods. Below REST endpoints for this project.

##### REST Endpoint `http://localhost:8080/ContactList` HTTP Method `GET` Description `Returns the list of person`
##### REST Endpoint `http://localhost:8080/ContactList/{id}` HTTP Method `GET` Description `Returns person detail for given person {id}`
##### REST Endpoint `http://localhost:8080/ContactList` HTTP Method `POST` Description `Creates new person from the post data`
##### REST Endpoint `http://localhost:8080/ContactList` HTTP Method `DELETE` Description `Delete the person on the method`
##### REST Endpoint `http://localhost:8080/ContactList/{id}` HTTP Method `DELETE` Description `Delete the person for given person {id}`

## JSON:

* ##### Sample

      `{
        "id": 3,
        "name": "DiMariar",
        "contact": [
            {
                "contactName": "Isco",
                "eMail": "isco@realmadrid.com",
                "phone": "+329988777"
            }
       }`
