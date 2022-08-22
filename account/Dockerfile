# Start with base image containing java runtime
FROM openjdk:17

# Add the application jar to the container
ADD target/account-0.0.1-SNAPSHOT.jar account-0.0.1-SNAPSHOT.jar

EXPOSE 8080
# Execute the application
ENTRYPOINT ["java","-jar","account-0.0.1-SNAPSHOT.jar","-web -webAllowOthers -tcp -tcpAllowOthers -browser"]