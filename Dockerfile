FROM eclipse-temurin:17
COPY target/devsample.jar devsample.jar
CMD [ "java", "-jar", "devsample.jar" ]