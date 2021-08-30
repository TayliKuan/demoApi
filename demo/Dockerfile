FROM java:8

EXPOSE 7998

ADD demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=pro"]