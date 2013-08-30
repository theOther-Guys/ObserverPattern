package com.WeatherModel;

import javax.swing.JOptionPane;

public class Sensor {
	
	private double pressure , humidity , temperature , todayMin , todayMax , tomorrowMin , tomorrowMax;
	public static Sensor sensor = new Sensor();
	
	public Sensor() {
		// TODO Auto-generated constructor stub
		
	}
	public Sensor(double pressure, double humidity , double temperature, double tomorrowMax, double tomorrowMin, double todayMin, double todayMax){
		this.humidity = humidity ;
		this.pressure = pressure ;
		this.temperature = temperature ;
		this.todayMax = todayMax ;
		this.todayMin = todayMin ;
		this.tomorrowMax = tomorrowMax ;
		this.tomorrowMin = tomorrowMin ;
	}
	public double getPressure (){
		return pressure;
	}
	public double getHumidity (){
		return humidity;
	}
	public double getTemperature (){
		return temperature;
	}
	public double[] getHTP(){
		double [] htp =  { pressure , humidity, temperature };
		return htp ;
	}
	public double getTodayMax (){
		return todayMax;
	}
	public double getTodayMin (){
		return todayMin;
	}
	public double getTomorrowMin (){
		return tomorrowMin;
	}
	public double getTomorrowMax (){
		return tomorrowMax;
	}
	public void setPressure (double pressure ){
		this.pressure= pressure;
	}
	public void setHumidity (double humidity){
		this.humidity = humidity ;
	}
	public void setTemperature (double temperature ){
		this.temperature = temperature ;
	}
	public void setTodayMax (double todayMax){
		this.todayMax = todayMax ;
	}
	public void setTodayMin (double todayMin){
		this.todayMin = todayMin ;
	}
	public void setTomorrowMax (double tomorrowMax){
		this.tomorrowMax = tomorrowMax ;
	}
	public void setTomorrowMin (double tomorrowMin){
		this.tomorrowMin = tomorrowMin ;
	}
	public double getAverage (){
		try {
		return this.todayMax / this.todayMin ;
		}catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null, " not correct number " );
		}
		return 0 ;
		}

}
