## To create Spring boot application

https://start.spring.io/

## Build application

``` 
mvn clean install
```

## Run the app

``` 
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mongo.yml down

```
## Creating docker image

```
mvn install dockerfile:build

```
## running docker compose

``` 
docker-compose up -d

```
## GET
curl --location --request GET 'localhost:8080/doctor/appointment?doctorName=dr1000' \--header 'Cookie: JSESSIONID=220BF56D32A07E51C56989336154CC25'

## Post
curl --location --request POST 'localhost:8080/doctor/save' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=220BF56D32A07E51C56989336154CC25' \
--data-raw ' {
"appointmentId": "Ap11",
"patientName": "p11",
"doctorName": "d11",
"date": "1 jan",
"prescription": {
"prescriptionId": "pr22",
"appointmentId": "Ap11",
"description": "crocine",
"patientName": "p11",
"doctorName": "d11"}
}'
## GET
curl --location --request GET 'localhost:8080/patient/appointment?patientName=p11' \--header 'Cookie: JSESSIONID=220BF56D32A07E51C56989336154CC25' \
--data-raw ''

## POST
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=220BF56D32A07E51C56989336154CC25' \
--data-raw ' {
"appointmentId": "Ap11",
"patientName": "p11",
"doctorName": "d11",
"date": "1 jan",
"prescription": {
"prescriptionId": "pr22",
"appointmentId": "Ap11",
"description": "crocine",
"patientName": "p11",
"doctorName": "d11"}
}'

## Docerization

$ mvn install dockerfile:build
$ docker images
$ docker-compose up -d
$ docker-compose down

## Show data
docker exec -it hospital-management-app-mongo-1 bash

mongo

show dbs

show tables

db.Hospital-management-app.find()