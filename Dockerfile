FROM openjdk:8
RUN mkdir -p /opt/store/
COPY ./target/self-healing.jar /opt/store/
WORKDIR /opt/store/
EXPOSE 8080
CMD ["java", "-jar", "self-healing.jar"]