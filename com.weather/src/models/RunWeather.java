package models;

import java.util.Scanner;

public class RunWeather {
	WeatherData nWeather = new WeatherData();

	public static void main(String[] args) {

		//WeatherData weather = new WeatherData();

		//weather.addObserver();
		//weather.addObserver();
		//weather.update(25, 23, 22);
		// StatisticDisplay s = new StatisticDisplay();

		// Observable obser = new Observable();

		//CurrentConditionDisplay cur = new CurrentConditionDisplay();
		//cur.update(22, 25, 27);
		RunWeather run = new RunWeather();
		run.console();

	}

	public void console() {
		showMessage();
		Scanner input = new Scanner(System.in);
		while (!input.nextLine().equals("exit")) {
			int value = input.nextInt();
			input.nextLine();
			switch (value) {
			case 1:
				System.out.println(addObserver());
				break;
			case 2:
				deleteObserver();
				break;
			case 3:
				updateObserver();
				break;
			default:
				showMessage();
				break;
			}
		}
		System.exit(0);
	}

	private void showMessage() {
		// TODO Auto-generated method stub
		System.out.println(" please Type 1 to add new Monitor "
				+ " \n Type 2 to delete a Monitor \r"
				+ "Type 3 to update the Weather \r" + "Type exit to close ");

	}

	private void updateObserver() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println(" type exit for exit \r"+
		" type numbers for update ");
		while (input.nextLine() != "exit"){
		
			System.out.println(" pressure  ");
			int pressure = input.nextInt();
			input.nextLine();
			System.out.println("humidity ");
			int humidity = input.nextInt();
			input.nextLine();
			System.out.println("temperature ");
			int temperature = input.nextInt();
			input.nextLine();
			nWeather.update(humidity, pressure, temperature);
			input.nextLine();
		}
	}

	private void deleteObserver() {
		// TODO Auto-generated method stub
		System.out.println(" Select an option to delete ");
		Scanner input = new Scanner(System.in);

		while (input.nextLine() != "exit") {
			for (int index = 0; index < Observable.observers.size(); index++) {
				System.out.println(index);
			}
			int number = input.nextInt();
			input.nextLine();
			if (number < Observable.observers.size()){
				Observable.observers.remove(number);
				System.out.println(" the Monitor is deleted ");
				break;
			}else {
				System.out.println(" there no such Monitor exist ");
				System.out.println("type exit to close go to main Menu ");
			}
		}
		console();
	}

	private String addObserver() {
		// TODO Auto-generated method stub
		nWeather.addObserver();
		return "new Monitor Added " ;
	}

}
