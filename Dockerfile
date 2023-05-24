FROM gradle:8.1.1-jdk17-alpine AS build
WORKDIR /board-game-tracker
COPY . .
COPY build.gradle /board-game-tracker
RUN gradle clean build

FROM openjdk:17
COPY --from=build /board-game-tracker/build/libs/board-game-tracker-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","board-game-tracker-0.0.1-SNAPSHOT.jar"]