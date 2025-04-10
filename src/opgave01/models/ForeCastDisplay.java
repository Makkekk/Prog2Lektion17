package opgave01.models;

public class ForeCastDisplay {
    private float lastTemp;
    private float lastHumidity;
    private float lastPressure;
    private boolean isFirstUpdate = true;

    public void update(float temp, float humidity, float pressure) {
        // Implementation for updating forecast display
        if (isFirstUpdate) {
            lastTemp = temp;
            lastHumidity = humidity;
            lastPressure = pressure;
            isFirstUpdate = false;
            System.out.println("Forecast: No data available yet.");
            return;
        }

        //Changes in values
        float tempChange = temp - lastTemp;
        float humidityChange = humidity - lastHumidity;
        float pressureChange = pressure - lastPressure;

        // Forecast
        float predictedTemp = temp + tempChange;
        float predictedHumidity = humidity + humidityChange;
        float predictedPressure = pressure + pressureChange;

        System.out.println("Forecast: " + predictedTemp + "°C, " + predictedHumidity + "% humidity, " + predictedPressure + " hPa");

        lastTemp = temp;
        lastHumidity = humidity;
        lastPressure = pressure;

    }
}
