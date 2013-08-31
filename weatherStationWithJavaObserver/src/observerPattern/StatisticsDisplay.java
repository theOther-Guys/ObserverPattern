package observerPattern;

import java.util.Observable;

public class StatisticsDisplay implements DisplayElement{

	private double average , min , max ;
	private double temp , pres , hum ;
	
	@Override
	public void update(Observable observi, Object argo) {
		if(observi instanceof WeatherData){
			WeatherData weatherSta = (WeatherData) observi;
			this.temp = weatherSta.getTemperature();
			this.pres = weatherSta.getPressure();
			this.hum = weatherSta.getHumidity();
			countMaxMinAverage(temp, pres, hum);
			display();
		}
		
	}

	@Override
	public void display() {
		System.out.println(" temperature is "+ temp + "\t" + 
				"Pressure is " + pres + " \t "+ " Humidity is " + hum);
		System.out.println(" Maximum temperature is " + max );
		System.out.println(" Minimum temperature is "+ min );
		
	}

	private void countMaxMinAverage (double temperature , double pressure , double humidity ){
		if (this.temp <= temperature){
			max = temperature ;
		}
		if (temperature < min ){
			min = temperature ;
		}
		average = (min + max) / 2 ;
	}
}
