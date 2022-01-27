# Spring Cloud example project

The project demonstrates Service Discovery pattern.
1. Execute `mvn clean install`
2. Run `EurekaServerApplication`
3. Open http://localhost:8761/
4. Run `StockApplication`
5. Check Instances currently registered with Eureka list

Thin microservice `EurekaServerApplication` provides information about all other services on 8761 port.

`StockApplication` contains business logic for fetching info through **feign client** 
and storing data in postgres through **spring-data-rest** library. 

1. Open http://localhost:8080/api/price endpoint to fetch data from external price provider
2. You can operate with postgres through http://localhost:8080/currencies endpoint

Add currency example:
```commandline
curl --location --request POST 'http://localhost:8080/currencies' \
--header 'Content-Type: application/json' \
--data-raw '{  
"name" : "USD",
"value" : "79"
}'
```