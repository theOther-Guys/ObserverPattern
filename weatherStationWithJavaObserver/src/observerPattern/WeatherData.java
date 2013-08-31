package observerPattern;

import java.util.Observable;

public class WeatherData extends Observable{
	
	private double temprature, humidity, pressure;
	
	public WeatherData(){
		
	}
	
	public void changingMeasurement(){
		setChanged();
		notifyObservers();
	}
	
	public void settingMeasurement(double temprature, double humidity, double pressure){
		this.temprature = temprature;
		this.humidity = humidity;
		this.pressure = pressure;
		changingMeasurement();
	}
	public  double getTemperature (){
		return temprature ;
	}
	public  double getPressure (){
		return pressure;
	}

	public  double getHumidity (){
		return humidity ;
	}
}
