FROM java:8
EXPOSE 8081

VOLUME /tmp
ADD mopin-api.jar /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
