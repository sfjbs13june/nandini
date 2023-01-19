## Build application

``` 
mvn clean install
```

## Run application

``` 
mvn spring-boot:run
```

## Test Application

```  
curl --location --request GET 'localhost:8080/add?a=2&b=8'

curl --location --request POST 'localhost:8080/sub?a=9&b=3'

curl --location --request PUT 'localhost:8080/mul?a=20&b=5'
```
