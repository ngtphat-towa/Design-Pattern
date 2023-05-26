package Chapter_02_OBSERVER.WeatherStation.displays;

import Chapter_02_OBSERVER.WeatherStation.iterfaces.IDisplayElement;
import Chapter_02_OBSERVER.WeatherStation.iterfaces.IObserver;
import Chapter_02_OBSERVER.WeatherStation.iterfaces.ISubject;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {

    private ISubject weatherData;

    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(ISubject subject) {
        weatherData = subject;
        display();
    }

    @Override
    public void display() {

        System.out.println("Current conditions: " + weatherData.getTemperature()
                + "F degrees and " + weatherData.getHumidity() + "% humidity");
    }

}
