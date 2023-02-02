#Build

mvn clean install

# Run
docker-compose -f docker-compose-artemis.yml up -d
artemis-message-producer> mvn spring-boot:run

# Send some message though producer

curl -X GET http://localhost:1230/send?name=nandini&age=22

# Start consumer
artemis-message-consumer>
cd .\artemis-message-consumer\
mvn spring-boot:run

# Start producer
artemis-message-producer>
cd .\artemis-message-consumer\
mvn spring-boot:run



## Stop Container

docker-compose -f docker-compose-artemis.yml down

#Show data::

http://localhost:8161/