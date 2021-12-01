FROM adoptopenjdk:16-jre-hotspot as builder
WORKDIR application
COPY target/sv2021-jvjbf-kepesitovizsga-pot-1.0-SNAPSHOT.jar questions.jar
RUN java -Djarmode=layertools -jar questions.jar extract

FROM adoptopenjdk:16-jre-hotspot
WORKDIR application
#RUN apt update \
    # && apt-get install wget \
    # && apt-get install -y netcat \
    # && wget https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh \
    # && chmod +x ./wait-for-it.sh
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
ENTRYPOINT ["java", \
"org.springframework.boot.loader.JarLauncher"]
