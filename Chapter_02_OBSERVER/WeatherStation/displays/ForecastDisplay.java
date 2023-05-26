package Chapter_02_OBSERVER.WeatherStation.displays;

import Chapter_02_OBSERVER.WeatherStation.iterfaces.IDisplayElement;
import Chapter_02_OBSERVER.WeatherStation.iterfaces.IObserver;
import Chapter_02_OBSERVER.WeatherStation.iterfaces.ISubject;

public class ForecastDisplay implements IObserver, IDisplayElement {

    private float currentPressure;
    private float lastPressure;
    private boolean isChanged = true;
    private ISubject weatherData;

    public ForecastDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(ISubject subject) {
        this.weatherData = subject;

        /// At the first time, the current was empty
        /// so we use current value as last time value
        if (isChanged) {
            currentPressure = weatherData.getPressure();
            isChanged = !isChanged;
        }
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: " +
                ((currentPressure > lastPressure) ? "Improving wather.\n"
                        : (currentPressure < lastPressure) ? "Getting Cooler, rainy wather.\n"
                                : "More of the same.\n"));
    }

}