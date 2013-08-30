package com.WeatherGUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.WeatherModel.Sensor;
import com.weatherController.addMonitorController;

public class Displayer extends JFrame {

	private JLabel temperature, humidity, pressure, todayMin, todayMax,
			tomorrowMax, tomorrowMin, todayAverage , statistics;
	private JButton remove = new JButton(" Remove ");

	public Displayer() {

		temperature = new JLabel(Sensor.sensor.getTemperature() + " ");
		temperature.setPreferredSize(new Dimension(150, 30));
		humidity = new JLabel(Sensor.sensor.getHumidity() + "");
		humidity.setPreferredSize(new Dimension(150, 30));
		pressure = new JLabel(Sensor.sensor.getPressure() + " ");
		pressure.setPreferredSize(new Dimension(150, 30));
		todayMax = new JLabel(Sensor.sensor.getTodayMax() + " ");
		todayMax.setPreferredSize(new Dimension(150, 30));
		todayMin = new JLabel(Sensor.sensor.getTodayMin() + " ");
		todayMin.setPreferredSize(new Dimension(150, 30));
		todayAverage = new JLabel(" ");
		setAverage();
		 statistics = new JLabel();
		statistics.setPreferredSize(new Dimension(150, 30));
		todayAverage.setPreferredSize(new Dimension(150, 30));
		tomorrowMax = new JLabel(Sensor.sensor.getTomorrowMax() + " ");
		tomorrowMax.setPreferredSize(new Dimension(100, 30));
		tomorrowMin = new JLabel(Sensor.sensor.getTomorrowMin() + " ");
		tomorrowMin.setPreferredSize(new Dimension(100, 30));

		// // Tomoorow's weather
		JPanel eastPanel = new JPanel(new BorderLayout(5, 5));
		JPanel cPanel = new JPanel(new GridLayout(0, 2));
		cPanel.add(new JLabel(" tomorrow Max :"));
		cPanel.add(tomorrowMax);
		cPanel.add(new JLabel(" tomorrow Min : "));
		cPanel.add(tomorrowMin);
		eastPanel.add(new JLabel(" Tomorrow's weather  ", JLabel.CENTER),
				BorderLayout.NORTH);
		eastPanel.add(statistics, BorderLayout.SOUTH);
		eastPanel.add(cPanel);

		// / today's weather
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		panel.add(new JLabel(" Temperature :"));
		panel.add(temperature);
		panel.add(new JLabel(" numidity : "));
		panel.add(humidity);
		panel.add(new JLabel(" Pressure : "));
		panel.add(pressure);
		panel.add(new JLabel(" Today Maximum :"));
		panel.add(todayMax);
		panel.add(new JLabel(" Today Minimum :"));
		panel.add(todayMin);
		panel.add(new JLabel(" Average :"));
		panel.add(todayAverage);

		getContentPane().add(panel);
		getContentPane().add(remove, BorderLayout.SOUTH);
		getContentPane().add(eastPanel, BorderLayout.EAST);

		setSize(450, 150);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);

		remove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Displayer.this.dispose();
				addMonitorController.display.remove(Displayer.this);

			}
		});
	}

	public void setTemperature(double temp) {
		temperature.setText(temp + " ");
	}

	public void setHumidity(double temp) {
		humidity.setText(temp + " ");
	}

	public void setPressure(double temp) {
		pressure.setText(temp + " ");
	}

	public void setTodayMax(double todayMax) {
		this.todayMax.setText(todayMax + " ");
	}

	public void setTodayMin(double todayMin) {
		this.todayMin.setText(todayMin + " ");
	}

	public void setTomorrowMax(double tomorrowMax) {
		this.tomorrowMax.setText(tomorrowMax + " ");
	}

	public void settomorrowMin(double tomorrowMin) {
		this.tomorrowMin.setText(tomorrowMin + " ");
	}

	public double Average(double min, double max) {
		try {
			return max / min;
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, " the min value is 0 ");
		}
		return 0;
	}

	public void setAverage() {
		todayAverage.setText(Sensor.sensor.getAverage() + " ");
	}

	public void setStatistics() {
		if (Double.parseDouble(todayAverage.getText()) <= 10) {
			statistics.setText("  Cloudy ");
		} else if (Double.parseDouble(todayAverage.getText()) <= 25) {
			statistics.setText(" Sunny ");
		} else if (Double.parseDouble(todayAverage.getText()) > 25
				&& Double.parseDouble(todayAverage.getText()) <= 40) {
			statistics.setText("  Sunny : Hot ");
		} else {
			statistics.setText(" very hot ");
		}
	}

}
