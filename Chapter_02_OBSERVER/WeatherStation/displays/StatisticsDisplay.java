package Chapter_02_OBSERVER.WeatherStation.displays;

import Chapter_02_OBSERVER.WeatherStation.iterfaces.IDisplayElement;
import Chapter_02_OBSERVER.WeatherStation.iterfaces.*;

public class StatisticsDisplay implements IDisplayElement, IObserver {
    private float maxTemp = 0.0f;
    private float minTemp = 0.0f;
    private float sumTemp = 0.0f;
    private int numReads = 0;
    private ISubject weatherData;

    public StatisticsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature statistic\n" +
                "Average: " + (sumTemp / numReads) +
                " F\nMin: " + minTemp +
                " F\nMax: " + maxTemp + " F\n");
    }

    @Override
    public void update(ISubject subject) {
        this.weatherData = subject;
        updateStatistics(weatherData);
        display();
    }

    private void updateStatistics(ISubject weatherData) {
        numReads++;
        float temperature = weatherData.getTemperature();
        sumTemp = sumTemp + temperature;

        if (temperature > maxTemp) {
            this.maxTemp = temperature;
        }

        if (numReads == 1) {
            this.minTemp = temperature;
        }

        if (temperature < minTemp) {
            this.minTemp = temperature;
        }
    }
}
