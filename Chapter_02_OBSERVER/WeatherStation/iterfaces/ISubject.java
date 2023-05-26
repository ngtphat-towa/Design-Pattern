package Chapter_02_OBSERVER.WeatherStation.iterfaces;

public interface ISubject {
    public void registerObserver(IObserver o);

    public void removeObserver(IObserver o);

    public void notifyObservers();

    public float getTemperature();

    public float getHumidity();

    public float getPressure();
}
