package models;

import java.util.ArrayList;


public class Observable implements Observer{

	private double temperature , pressure, humidity ;
	public static ArrayList<Observable> observers = new ArrayList<Observable>();
	boolean isChanged ;
	
	ForcastDisplay forcast = new ForcastDisplay();
	StatisticDisplay statistics = new StatisticDisplay();
	
	protected void deleteObserver (Observer observer){
		observers.remove(observer);
		System.out.println(" one observer is out ");
		System.out.println(" the remaining observer is :"+ observers.size());
	}
	protected void notifyObservers(){
		if (isChanged == true )
		for (int index = 0 ; index < observers.size() ; index ++){
			observers.get(index).update();
			observers.get(index).forcast.update();
			observers.get(index).statistics.update();
		}
		isChanged = false ;
	}
	protected void addObserver(){
		observers.add(new Observable());
		notifyObservers();
	}
	protected void setChanged(){
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.humidity = WeatherData.getHumidity() ;
		this.pressure = WeatherData.getPressure(); 
		this.temperature = WeatherData.getTemperature();
		isChanged = true ;
		//notifyObservers();
	}

}
