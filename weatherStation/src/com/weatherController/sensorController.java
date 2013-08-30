package com.weatherController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.WeatherGUI.Displayer;
import com.WeatherModel.Sensor;

public class sensorController implements ActionListener {

	private JTextField field1 = new JTextField(), field2 = new JTextField(),
			field3 = new JTextField(), field4 = new JTextField(),
			field5 = new JTextField(), field6 = new JTextField(),
			field7 = new JTextField();

	public sensorController(JTextField field1, JTextField field2,
			JTextField field3, JTextField field4, JTextField field5,
			JTextField field6, JTextField field7) {
		// TODO Auto-generated method stub

		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
		this.field5 = field5;
		this.field6 = field6;
		this.field7 = field7;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		checkNumbers();
		updateFields();
		setFields();
	}

	public void checkNumbers() {
		try {
			Sensor.sensor.setPressure(Double.parseDouble(field1.getText()));
			Sensor.sensor.setHumidity(Double.parseDouble(field2.getText()));
			Sensor.sensor.setTemperature(Double.parseDouble(field3.getText()));
			Sensor.sensor.setTomorrowMax(Double.parseDouble(field4.getText()));
			Sensor.sensor.setTomorrowMin(Double.parseDouble(field5.getText()));
			Sensor.sensor.setTodayMax(Double.parseDouble(field6.getText()));
			Sensor.sensor.setTodayMin(Double.parseDouble(field7.getText()));

		} catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(null,
					" please type number not alphabates ");
		}
	}

	public void updateFields() {
		for (int i = 0; i < addMonitorController.display.size(); i++) {
			addMonitorController.display.get(i).setPressure(
					Sensor.sensor.getPressure());
			addMonitorController.display.get(i).setTemperature(
					Sensor.sensor.getTemperature());
			addMonitorController.display.get(i).setHumidity(
					Sensor.sensor.getHumidity());
			addMonitorController.display.get(i).setTodayMax(
					Sensor.sensor.getTodayMax());
			addMonitorController.display.get(i).setTodayMin(
					Sensor.sensor.getTodayMin());
			addMonitorController.display.get(i).setTomorrowMax(
					Sensor.sensor.getTomorrowMax());
			addMonitorController.display.get(i).settomorrowMin(
					Sensor.sensor.getTomorrowMin());
			addMonitorController.display.get(i).setAverage();
			addMonitorController.display.get(i).setStatistics();

		}
	}

	private void setFields() {

		field1.setText(Sensor.sensor.getPressure() + " ");
		field2.setText(Sensor.sensor.getHumidity() + " ");
		field3.setText(Sensor.sensor.getTemperature() + " ");
		field4.setText(Sensor.sensor.getTomorrowMax() + " ");
		field5.setText(Sensor.sensor.getTomorrowMin() + " ");
		field6.setText(Sensor.sensor.getTodayMax() + " ");
		field7.setText(Sensor.sensor.getTodayMin() + " ");

	}

}
