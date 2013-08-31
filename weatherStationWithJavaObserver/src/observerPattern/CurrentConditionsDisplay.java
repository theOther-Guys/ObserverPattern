package observerPattern;

import java.util.Observable;

public class CurrentConditionsDisplay implements DisplayElement {

	
	Observable weatherST;
	private double temp;
	private double hum;
	
	public CurrentConditionsDisplay(Observable observi){
		this.weatherST = observi;
		weatherST.addObserver(this);
	}
	@Override
	public void update(Observable observi, Object argo) {
		if(observi instanceof WeatherData){
			WeatherData weatherSta = (WeatherData) observi;
			this.temp = weatherSta.getTemperature();
			this.hum = weatherSta.getHumidity();
			display();
		}
		
	}

	@Override
	public void display() {
		System.out.println(" the current condition is : " );
		System.out.println(" temperature is " + temp + " degree centigrate ");
		System.out.println( " with humidity of :" + hum + "% percent ");
		
	}

}
