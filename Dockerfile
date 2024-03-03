FROM maven:latest

WORKDIR /BerhanuDocker

COPY pom.xml /BerhanuDocker/

COPY . /BerhanuDocker/

RUN mvn package

CMD ["java", "-jar", "target/hellodocker.jar"]
