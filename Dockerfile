FROM adoptopenjdk:11-jre-openj9
ADD target/apprestservice.jar apprestservice.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","apprestservice.jar"]