FROM docker.io/library/openjdk:17.0.1-jdk-slim
COPY build/libs/demo*SNAPSHOT.jar /usr/local/lib/demo.jar
# COPY truststore.jks /tmp/truststore.jks

EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]