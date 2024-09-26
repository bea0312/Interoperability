package hr.isabelle.weatherserver;

public class WeatherData {
    private String cityName;
    private double temperature;

    public WeatherData(String cityName, double temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public double getTemperature() {
        return temperature;
    }
}

