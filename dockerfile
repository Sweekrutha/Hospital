FROM openjdk:17
LABEL maintainer="com.example.SairamHospital"
ADD target/SairamHospital-0.0.1-SNAPSHOT.jar SairamHospital.jar
ENTRYPOINT ["java","-jar","SairamHospital.jar" ]