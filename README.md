# FoodOrderingApp

Сервис на SpringBoot с Kafka, БД - PostgreSQL. 

Для запуска сервиса необходимо выполнить для модулейц KafkaConsumer и KafkaProducer:  
mvn clean package

После завершения работы maven при запущенном Docker ввести команду:   
docker-compose up

Будут развернуты 6 контейнеров Docker. Доступ к сервису по: localhost:8080
