FROM openjdk:8

COPY target/spring-boot-j8-1.0.0-exec.jar /opt

EXPOSE 8081

CMD cd /opt && java -Dserver.port=8081 -jar spring-boot-j8-1.0.0-exec.jar