FROM openjdk:17 
EXPOSE 8080
ADD target/trafego-0.0.1-SNAPSHOT.jar trafego.jar
ENTRYPOINT ["java","-jar", "/trafego.jar"]
