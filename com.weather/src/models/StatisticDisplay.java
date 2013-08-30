package models;

public class StatisticDisplay implements DisplayElement , Observer{

	
	private double average , min , max ;
	private double temperature , pressure , humidity ;

	public StatisticDisplay() {
	
		display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println(" temperature is "+ temperature + "\t" + 
		"Pressure is " + pressure + " \t "+ " Humidity is " + humidity);
		System.out.println(" Maximum temperature is " + max );
		System.out.println(" Minimum temperature is "+ min );
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		this.temperature = WeatherData.getTemperature() ;
		this.humidity = WeatherData.getHumidity() ;
		this.pressure = WeatherData.getPressure();
		countMaxMinAverage(temperature, pressure, humidity);
		display();
	}
	private void countMaxMinAverage (double temperature , double pressure , double humidity ){
		if (this.temperature <= temperature){
			max = temperature ;
		}
		if (temperature < min ){
			min = temperature ;
		}
		average = (min + max) / 2 ;
	}
	

}
