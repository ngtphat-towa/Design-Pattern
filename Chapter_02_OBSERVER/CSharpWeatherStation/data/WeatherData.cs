public struct Weather
{
    public double Temperature { get; }
    public double Humidity { get; }
    public double Pressure { get; }

    public Weather(double temperature, double humidity, double pressure)
    {
        Temperature = temperature;
        Humidity = humidity;
        Pressure = pressure;
    }
}
class WeatherData : IObservable<Weather>
{
    private Weather currentWeather;
    private List<IObserver<Weather>> observers;

    public WeatherData()
    {
        this.observers = new List<IObserver<Weather>>();
    }

    public IDisposable Subscribe(IObserver<Weather> observer)
    {
        if (!observers.Contains(observer))
            observers.Add(observer);
        observer.OnNext(currentWeather);
        return new Unsubscriber(observers, observer);
    }

    public void SetMeasurements(Weather weather)
    {
        currentWeather = weather;
        NotifyObservers();
    }

    private void NotifyObservers()
    {
        foreach (var observer in observers)
            observer.OnNext(currentWeather);
    }



    private class Unsubscriber : IDisposable
    {
        private List<IObserver<Weather>> _observers;
        private IObserver<Weather> _observer;

        public Unsubscriber(List<IObserver<Weather>> observers, IObserver<Weather> observer)
        {
            this._observers = observers;
            this._observer = observer;
        }

        public void Dispose()
        {
            if (_observer != null && _observers.Contains(_observer))
                _observers.Remove(_observer);
        }
    }
}
