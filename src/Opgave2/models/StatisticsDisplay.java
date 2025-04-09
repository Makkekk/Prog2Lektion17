package Opgave2.models;

public class StatisticsDisplay implements Observer {
    private float totalTemp = 0;
    private float totalHumidity = 0;
    private float totalPressure = 0;
    private int count = 0;

    public void update(float temp, float humidity, float pressure) {
        // Implementation for updating statistics display
        totalTemp += temp;
        totalHumidity += humidity;
        totalPressure += pressure;
        count++;

        //averages
        float avgTemp = totalTemp / count;
        float avgHumidity = totalHumidity / count;
        float avgPressure = totalPressure / count;

        System.out.println("forceasted conditions: " + avgTemp + "°C, " + avgHumidity + "% humidity, " + avgPressure + " hPa");
    }
}
