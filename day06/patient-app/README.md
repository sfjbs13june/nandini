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
}'```