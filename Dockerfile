FROM openjdk:17

COPY target/product-1.0.2-BETA.jar app.jar

#java -jar app.jar command to run java file
ENTRYPOINT ["java", "-jar", "app.jar"]