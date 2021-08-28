# reporting_system_aws
Ran the codes and established the system(except EmailService) with AWS SQS/SNS/S3 and tested manually
# Add new features of update/delete report
Designed and implemented RESTful API for update/delete operations for ClientService/ExcelService/PDFService, adding corresponding logic.
# Improve sync API performance by using multithreading and sending request concurrently to both services
Adapted multithreading with CompletableFuture and ThreadPoolTaskExecutor to synchronized request sending logic in ClientService
# Use a database instead of hashmap in the ExcelRepositoryImpl.
Added Spring Data Mongodb dependency and worked with MongoDB, MongoTemplate(MongoOperations) to replace hashmap storage.
# Convert sync API into microservices by adding Eureka/Ribbon support.
Added Spring Cloud Eureka dependency and a Eureka server, converting older sync API into microservices architecture.
Added Ribbon support
