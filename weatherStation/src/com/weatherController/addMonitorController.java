package com.weatherController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.WeatherGUI.Displayer;

public class addMonitorController implements ActionListener{
	public static ArrayList<Displayer> display = new ArrayList<Displayer>();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Displayer monitor = new Displayer();
		display.add(monitor);
		System.out.println(display.size());
		
	}
	

}
