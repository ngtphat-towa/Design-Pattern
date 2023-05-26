package Chapter_02_OBSERVER.WeatherStation.datas;

import java.util.ArrayList;

import Chapter_02_OBSERVER.WeatherStation.iterfaces.IObserver;
import Chapter_02_OBSERVER.WeatherStation.iterfaces.ISubject;

public class WeatherData implements ISubject {

    private ArrayList<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData() {
        observers = new ArrayList<IObserver>();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add((IObserver) o);
    }

    @Override
    public void removeObserver(IObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
