package Opgave2.models;

public class CurrentConditionsDisplay implements Observer {

    public void update(float temp, float humidity, float pressure) {
        // Implementation for updating current conditions display
        System.out.println("Current conditions: " + temp + "°C, " + humidity + "% humidity, " + pressure + " hPa");
    }
}
