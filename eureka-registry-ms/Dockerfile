FROM java:8

COPY ./target/eureka-registry-ms.jar /app.jar
ENTRYPOINT [ "java", "-jar", "-Djava.security.egd=file:/dev/./urandom", "/app.jar" ]
CMD [ "--spring.profiles.active=peer1" ]

EXPOSE 8763 8762