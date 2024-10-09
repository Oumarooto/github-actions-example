FROM openjdk:17
EXPOSE 8080
ADD target/springboot-github-action-cicd.jar springboot-github-action-cicd.jar
ENTRYPOINT ["java","-jar", "/springboot-github-action-cicd.jar"]