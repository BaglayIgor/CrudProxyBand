FROM openjdk:11
LABEL maintainer="CRUDTest"
ADD target/CRUDProxyBandTest-0.0.1-SNAPSHOT.jar CRUDProxyBandTest.jar
ENTRYPOINT ["java", "-jar", "CRUDProxyBandTest.jar"]