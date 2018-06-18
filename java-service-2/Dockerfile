FROM frolvlad/alpine-oraclejdk8:slim

ENV TZ=America/New_York
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

WORKDIR /opt/localuser/java-service-2/jars
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar java-service-2-0.1.0.jar" ]