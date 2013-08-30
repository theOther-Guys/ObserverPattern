package models;

public class CurrentConditionDisplay extends WeatherData implements Observer, DisplayElement{


	@Override
	public void update() {
		// TODO Auto-generated method stub
		update(0, 0, 0);
	}
	public void display (){
		
		System.out.println(" the current condition is : " );
		System.out.println(" temperature is " + WeatherData.getTemperature() + " degree centigrate ");
		System.out.println( " with humidity of :" + WeatherData.getHumidity() + "% percent ");
		
	}
	
}
