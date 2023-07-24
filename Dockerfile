FROM openjdk:11
EXPOSE 5066
ADD target/cicd-demo.jar cicd-demo.jar
ENTRYPOINT ["java","-jar","/cicd-demo.jar"]