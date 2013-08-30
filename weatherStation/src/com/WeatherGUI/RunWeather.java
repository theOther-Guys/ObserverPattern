package com.WeatherGUI;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;

public class RunWeather {
	
	public static void main(String[] args) {
		
	//	LookAndFeelInfo[] look_and_feel = UIManager.getInstalledLookAndFeels();
		SensorsGUI sen = new SensorsGUI();
		/*
		try {
			UIManager.setLookAndFeel(look_and_feel[1].getClassName());
			SwingUtilities.updateComponentTreeUI(sen);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(" not shown ");
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			System.out.println(" show me up ");
			e.printStackTrace();

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			System.out.println(" show this ");
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			System.out.println("not supported here ");
			e.printStackTrace();
		}
		*/
		
	}

}
