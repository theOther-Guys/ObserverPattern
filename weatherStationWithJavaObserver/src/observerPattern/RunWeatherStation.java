package observerPattern;

public class RunWeatherStation {

	public static void main(String[] args) {
		WeatherData weather = new WeatherData();

		StatisticsDisplay s = new StatisticsDisplay();

		CurrentConditionsDisplay cur = new CurrentConditionsDisplay(weather);
	}

}
