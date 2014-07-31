package template.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import template.hook.CaffeineBeverage;

public class CoffeeWithHook extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}

	}

	private String getUserInput() {
		String answer = null;
		System.out
				.println("Would you like milk and sugar with your coffee? (Y/N)");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (answer == null) {
			return "No";
		}
		return answer;
	}

}