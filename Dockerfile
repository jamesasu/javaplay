FROM maven:3.6.3-openjdk-11
WORKDIR /usr/src/app
COPY . .
RUN mvn package
CMD java -cp target/myapp-1.0-SNAPSHOT.jar au.org.suqld.App