package Opgave2.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private Random random;

    public WeatherData() {
        observers = new ArrayList<>();
        random = new Random();

    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer == null) {
            throw new IllegalArgumentException("Observer cannot be null");
        }
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer != null)
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements() {
        this.temperature = getTemperature();
        this.humidity = getHumidity();
        this.pressure = getPressure();
        notifyObservers();
    }
    private float getTemperature() {
        return Math.round(random.nextFloat(-20, 40) * 100) / 100.0f;
    }

    private float getHumidity() {
        return Math.round(random.nextFloat(2, 98));
    }

    private float getPressure() {
        return random.nextInt(900, 1080);
    }
}
