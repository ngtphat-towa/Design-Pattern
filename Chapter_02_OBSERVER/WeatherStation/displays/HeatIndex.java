package Chapter_02_OBSERVER.WeatherStation.displays;

import Chapter_02_OBSERVER.WeatherStation.iterfaces.IDisplayElement;
import Chapter_02_OBSERVER.WeatherStation.iterfaces.IObserver;
import Chapter_02_OBSERVER.WeatherStation.iterfaces.ISubject;

public class HeatIndex implements IDisplayElement, IObserver {

    private float heatIndex = 0.0f;
    private ISubject weatherData;

    public HeatIndex(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(ISubject subject) {
        this.weatherData = subject;
        this.heatIndex = generateIndex(weatherData.getTemperature(), weatherData.getHumidity());
        display();
    }

    @Override
    public void display() {
        System.out.println("Heat indext: " + heatIndex + "\n");
    }

    public float generateIndex(float t, float rh) {
        float index = (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                        (rh * rh * rh))
                + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));

        return index;
    }

}
