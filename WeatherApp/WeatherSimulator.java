import java.util.Random;
import java.util.Scanner;

public class WeatherSimulator {
    // Predefined weather data sets
    private static final String[] SUPPORTED_CITIES = {
        "New York", "London", "Tokyo", 
        "Paris", "Berlin", "Sydney", "Dubai"
    };
    
    private static final String[] WEATHER_CONDITIONS = {
        "Sunny", "Partly Cloudy", "Cloudy",
        "Rain", "Thunderstorm", "Snow", "Fog"
    };
    
    private static final String[] WEATHER_DESCRIPTIONS = {
        "Clear skies throughout the day",
        "Clouds increasing in the afternoon",
        "Overcast with occasional breaks",
        "Light rain expected this evening",
        "Severe thunderstorms possible",
        "Heavy snowfall overnight",
        "Dense fog warning in effect"
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Weather Simulator ===");
        System.out.println("Available locations: " + String.join(", ", SUPPORTED_CITIES));
        System.out.print("Enter location name: ");
        String location = input.nextLine();
        
        WeatherReport report = generateWeatherReport(location);
        displayWeatherReport(location, report);
        
        input.close();
    }
    
    private static WeatherReport generateWeatherReport(String location) {
        Random random = new Random();
        
        // Validate location
        if (!isSupportedLocation(location)) {
            return null;
        }
        
        // Generate realistic weather data
        return new WeatherReport(
            WEATHER_CONDITIONS[random.nextInt(WEATHER_CONDITIONS.length)],
            WEATHER_DESCRIPTIONS[random.nextInt(WEATHER_DESCRIPTIONS.length)],
            random.nextInt(35) - 5,  // Temperature (-5 to 30°C)
            random.nextInt(60) + 20, // Humidity (20-80%)
            random.nextInt(40),      // Wind speed (0-40 km/h)
            random.nextBoolean()     // Severe weather alert
        );
    }
    
    private static boolean isSupportedLocation(String location) {
        for (String city : SUPPORTED_CITIES) {
            if (city.equalsIgnoreCase(location)) {
                return true;
            }
        }
        return false;
    }
    
    private static void displayWeatherReport(String location, WeatherReport report) {
        System.out.println("\n=== Weather Report ===");
        System.out.println("Location: " + location);
        
        if (report == null) {
            System.out.println("\nThis location is not currently supported.");
            System.out.println("Please try one of: " + String.join(", ", SUPPORTED_CITIES));
            return;
        }
        
        System.out.println("----------------------");
        System.out.println("Current Conditions: " + report.condition);
        System.out.println("Forecast: " + report.description);
        System.out.println("Temperature: " + report.temperature + "°C");
        System.out.println("Humidity: " + report.humidity + "%");
        System.out.println("Wind Speed: " + report.windSpeed + " km/h");
        
        if (report.severeAlert) {
            System.out.println("\n[!] Severe Weather Alert: Take precautions!");
        }
        
        System.out.println("======================");
    }
    
    static class WeatherReport {
        String condition;
        String description;
        int temperature;
        int humidity;
        int windSpeed;
        boolean severeAlert;
        
        public WeatherReport(String condition, String description, 
                           int temperature, int humidity, 
                           int windSpeed, boolean severeAlert) {
            this.condition = condition;
            this.description = description;
            this.temperature = temperature;
            this.humidity = humidity;
            this.windSpeed = windSpeed;
            this.severeAlert = severeAlert;
        }
    }
}