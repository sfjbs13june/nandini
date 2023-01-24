# Create project

``` 
https://start.spring.io/
```

# Build the project

``` 
mvn clean install
```

# Run application

``` 
mvn spring-boot:run
```

# Testing the application

/get/student:
```
curl --location --request GET 'localhost:8080/get/student' \
--header 'Cookie: JSESSIONID=EBA2CF4DBE4AEFB32DA5793D8BBB3552'
```

/map/student:
```
curl --location --request GET 'localhost:8080/map/student' \
--header 'Cookie: JSESSIONID=EBA2CF4DBE4AEFB32DA5793D8BBB3552'
```