

public class CurrentConditionDisplay : IObserver<Weather>
{
    private IDisposable? unsubscriber;
    private Weather currentWeather;

    public void Display()
    {
        Console.WriteLine($"Current conditions: {currentWeather.Temperature}F degrees and {currentWeather.Humidity}% humidity");
    }
    public virtual void Unsubscribe() => unsubscriber!.Dispose();

    public virtual void OnCompleted()
    {
        Console.WriteLine("Additional weather data will not be transmitted.");
        this.Unsubscribe();
    }

    public virtual void OnError(Exception error)
    {
        Console.WriteLine("Error transmitting weather data.");
    }

    public virtual void OnNext(Weather value)
    {
        currentWeather = value;
        Display();
    }
}
