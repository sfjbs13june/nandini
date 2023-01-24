## Build application

``` 
mvn clean install
```

## Run application

``` 
mvn spring-boot:run
```

## Test Application
PostMapping->
```
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Content-Type: application/json' \
--data-raw '{
"id": "123",
"name" :"xyz",
"age" :"60",
"gender" :"male",
"disease" :"cough"
}'
```
PutMapping -> 
```
curl --location --request PUT 'localhost:8080/patient/update?disease=fever&age=70' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": "123",
    "name" :"xyz",
    "age" :"60",
    "gender" :"male",
    "disease" :"cough"
}
```

Security->
```
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=EBA2CF4DBE4AEFB32DA5793D8BBB3552' \
--data-raw '{
    "id": "123",
    "name" :"xyz",
    "age" :"70",
    "gender" :"male",
    "disease" :"fever"
}
```
