package observerPattern;

import java.util.Observable;

public class ForecastDisplay implements DisplayElement{

	private  double tempa, presa, huma;
	String statistics, rain;
	
	@Override
	public void update(Observable observi, Object argo) {
		if(observi instanceof WeatherData){
			WeatherData weatherSta = (WeatherData) observi;
			this.tempa = weatherSta.getTemperature();
			this.presa = weatherSta.getPressure();
			this.huma = weatherSta.getHumidity();
			display();
		}
		
	}

	@Override
	public void display() {
		checkForStatistics() ;
		System.out.println(" the weather is : " + statistics +"\t" + rain);
		
	}

	private void checkForStatistics() {
		if (tempa < 0 && tempa > -10) {
			statistics = " Rainy ";
		}
		else if (tempa > 0 && tempa < 10 ){
			statistics = " Cloudy " ;
		}
		else if (tempa > 10 && tempa < 25){
			statistics = " Sunny Cloudy ";
		}
		else {
			statistics = " Sunny ";
		}
		if (presa < 0 && presa > - 10) {
			rain = " raining ";
		}else if (presa > 0 && presa < 10){
			rain = " Cloudy  rainy" ;
			 
		}else if (presa > 10 && presa < 25 ){
			rain = " ";
		}else {
			
		}

	}	
}
