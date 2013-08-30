package models;

public class ForcastDisplay implements DisplayElement, Observer {

	private  double temperature, pressure, humidity;
	String statistics, rain;
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		checkForStatistics() ;
		System.out.println(" the weather is : " + statistics +"\t" + rain);

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.temperature = WeatherData.getTemperature()  ;
		this.pressure = WeatherData.getPressure() ;
		this.humidity  = WeatherData.getHumidity();
		display();
	}

	private void checkForStatistics() {
		if (temperature < 0 && temperature > -10) {
			statistics = " Rainy ";
		}
		else if (temperature > 0 && temperature < 10 ){
			statistics = " Cloudy " ;
		}
		else if (temperature > 10 && temperature < 25){
			statistics = " Sunny Cloudy ";
		}
		else {
			statistics = " Sunny ";
		}
		if (pressure < 0 && pressure > - 10) {
			rain = " raining ";
		}else if (pressure > 0 && pressure < 10){
			rain = " Cloudy  rainy" ;
			 
		}else if (pressure > 10 && pressure < 25 ){
			rain = " ";
		}else {
			
		}

	}

}
