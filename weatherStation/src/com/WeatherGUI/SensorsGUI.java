package com.WeatherGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.weatherController.addMonitorController;
import com.weatherController.sensorController;

public class SensorsGUI extends JFrame{
	
	
	private JTextField pressure , humidity , temperature , todayMax , todayMin;
	
	private JButton update ;
	
	private JPanel panelEast ;
	private JLabel tomorrow = new JLabel(" Tomorow's weather ");
	private JLabel max , min ;
	private JTextField txt_max , txt_min ;
	
	public SensorsGUI() {
		
		pressure = new JTextField(25);
		humidity = new JTextField(25);
		temperature = new JTextField(25);
		todayMax = new JTextField(25);
		todayMin = new JTextField(25); 
		update = new JButton(" update ");
		JButton addDisplayer = new JButton(" addMonitor ");
		
		/// tomorrow 's weather 
		max = new JLabel(" Maximum ");
		min = new JLabel(" Minimum :");
		txt_max = new JTextField(15);
		txt_min = new JTextField(15);
		panelEast = new JPanel(new BorderLayout(5, 5));
		panelEast.add(tomorrow, BorderLayout.NORTH);
		JPanel cPanel = new JPanel(new GridLayout(0, 2));
		cPanel.add(max);
		cPanel.add(txt_max);
		cPanel.add(min);
		cPanel.add(txt_min);
		panelEast.add(cPanel);
		
		
		JPanel centerPanel = new JPanel();
		JPanel southPanel = new JPanel();
		
		centerPanel.setLayout(new GridLayout(0, 2));
		
		JLabel lbl_pressure = new JLabel(" Pressure : ");
		JLabel lbl_humidity = new JLabel(" Humidity : ");
		JLabel lbl_temperature = new JLabel(" Temperature : ");
		JLabel lbl_min = new JLabel("Minimum :");
		JLabel lbl_max = new JLabel(" Maximum :");
		
		centerPanel.add(lbl_temperature);
		centerPanel.add(temperature);
		centerPanel.add(lbl_humidity);
		centerPanel.add(humidity);
		centerPanel.add(lbl_pressure);
		centerPanel.add(pressure);
		centerPanel.add(lbl_max);
		centerPanel.add(todayMax);
		centerPanel.add(lbl_min);
		centerPanel.add(todayMin);
		southPanel.add(update);
		southPanel.add(addDisplayer);
		
		getContentPane().add(centerPanel);
		getContentPane().add(southPanel, BorderLayout.SOUTH);
		getContentPane().add(panelEast,BorderLayout.EAST);
		
		
		setSize(800, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		update.addActionListener(new sensorController(pressure , humidity , temperature , txt_max , txt_min ,
				todayMax , todayMin));
		addDisplayer.addActionListener(new addMonitorController());
	}
	

}
