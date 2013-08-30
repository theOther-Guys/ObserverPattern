package models;

import java.util.Observer;

public class WeatherData extends Observable{
	
	private static double humidity , pressure , temperature ;
	boolean isChanged ;
	
	public void update (double humidity, double pressure , double temperature ){
		WeatherData.humidity = humidity;
		WeatherData.pressure = pressure;
		WeatherData.temperature = temperature ;
		isChanged = true ;
		notifyObserver();
		
	}
	public void registerObserver (){
		 addObserver();
		 System.out.println(" you registered a new Observer ");
	}
	public void removeObserver (Observer observer){
		deleteObserver((models.Observer) observer);
	}
	public void notifyObserver (){
		if (isChanged == true ){
			for (int index = 0 ; index < Observable.observers.size() ; index ++){
				Observable.observers.get(index).update();
				Observable.observers.get(index).statistics.update();
				Observable.observers.get(index).forcast.update();
			}
		}
		isChanged = false ;
	}
	public static double getTemperature (){
		return temperature ;
	}
	public static double getPressure (){
		return pressure;
	}
	public void measurementChanged (){
		isChanged = true ;
	}
	public static double getHumidity (){
		return humidity ;
	}

}
