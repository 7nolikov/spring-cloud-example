# Spring Cloud example project

The project demonstrates Service Discovery pattern.
Thin microservice `eureka-server` provides information about all other services on 8761 port.
`stock` contains business logic for fetching info through feign client 
and storing data in postgres through spring-data-rest library. 