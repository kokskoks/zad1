package pl.lodz.p.zad1.ind179640ind187824;

import java.util.Scanner;

public class QuestionCallbackImpl implements QuestionCallback {

	public boolean checkSuccess(boolean success) {
		if (!success) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Czy chcesz zmienic sciezke i sprobowac jeszcze raz? (y/n)");
			String tryAgain = scanner.nextLine();
			if (tryAgain.equalsIgnoreCase("y")) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

}
