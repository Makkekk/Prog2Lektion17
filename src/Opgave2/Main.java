package Opgave2;

import Opgave2.models.CurrentConditionsDisplay;
import Opgave2.models.ForeCastDisplay;
import Opgave2.models.StatisticsDisplay;
import Opgave2.models.WeatherData;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay staticDisplay = new StatisticsDisplay();
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(staticDisplay);
        weatherData.registerObserver(foreCastDisplay);

        for(int i = 0; i < 10; i++) {
            weatherData.setMeasurements();
            Thread.sleep(1000);
        }
    }
}
