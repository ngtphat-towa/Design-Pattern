package Chapter_02_OBSERVER.WeatherStation;


import Chapter_02_OBSERVER.WeatherStation.datas.WeatherData;
import Chapter_02_OBSERVER.WeatherStation.displays.*;

public class WeatherStation {
    public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay  = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay  = new StatisticsDisplay(weatherData);
		ForecastDisplay  forecastDisplay  = new ForecastDisplay(weatherData);
		HeatIndex heatIndexDisplay = new HeatIndex(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.4f);
		weatherData.setMeasurements(78, 90, 29.4f);

		System.out.println("---------");
		currentDisplay.display();
		statisticsDisplay.display();
		forecastDisplay.display();
		heatIndexDisplay.display();
        
	}
}
