FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/docker-luminus-example.jar /docker-luminus-example/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/docker-luminus-example/app.jar"]
