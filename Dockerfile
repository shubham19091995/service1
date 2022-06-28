FROM openjdk:8
EXPOSE 8081
ADD target/service1.jar service1.jar
ENTRYPOINT ["java","-jar","/service1.jar"]