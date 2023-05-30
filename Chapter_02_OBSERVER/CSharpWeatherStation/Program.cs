
CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
WeatherData weatherData = new WeatherData();
weatherData.Subscribe(currentDisplay);

weatherData.SetMeasurements(new Weather(80, 65, 30.4f));
weatherData.SetMeasurements(new Weather(82, 70, 29.4f));
weatherData.SetMeasurements(new Weather(78, 90, 29.4f));
