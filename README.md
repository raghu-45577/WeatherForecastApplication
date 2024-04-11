## Weather Forecast Application

- This application is used to get the weather forecasts summary, hourly forecasts based on the given location and coordinates.
- This application uses the external APIs(Forecast APIs) from RapidAPI.
- This is a spring boot application.

### How to use

- Clone the Application into the local system.
- Open the application in any IDE and run the aaplication.
- Open the postman and create a new get request.
- Hit the endpoint **http://localhost:8080/{city name}/summary** (provide the city name).
- This will give the detailed summary of the weather forecast of that particular location.
- Now create another get request and hit **http://localhost:8080/{city name}/hourly** (provide city name).
- This will give the hourly forecast of the location given. (Currently it will not give the forecast since it is a paid API).
- Now create another get request and hit **http://localhost:8080/{latitude}/{longitude}/summary** (provide latitude and longitude coordinates).
- This will give the weather forecast for the location of the coordinates provided.

### Folder Structure

```

WeatherForecastApplication
    |
    |
    |--->.mvn
    |
    |
    |
    |--->.settings
    |
    |                                                                 |-->WeatherForecastApplication.java
    |                                                                 |-->controller--->WeatherForecastController.java
    |--->src--->|-->main--->|-->java--->com--->weather--->forecast--->|-->service--->|-->WeatherForecastService.java
    |           |           |                                                        |-->WeatherForecastServiceImpl.java
    |           |           |-->resources-->|-->application.properties
    |           |                           |-->static
    |           |                           |-->templates
    |           |-->test--->java--->com--->weather--->forecast--->WeatherForecastApplicationTests.java
    |
    |
    |--->target
    |
    |--->.classpath
    |
    |--->.project
    |
    |--->HELP.md
    |
    |--->mvnw
    |
    |--->mvnw.cmd
    |
    |--->pom.xml

```
