package pl.lodz.p.zad1.ind179640ind187824;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] data = new String[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj nazwe");
		data[0] = scanner.nextLine();
		System.out.println("Podaj poprawny string:");
		data[1] = scanner.nextLine();
		System.out.println("Podaj niepoprawny string:");
		data[2] = scanner.nextLine();
		
		QuestionCallback callback = null;
		
		saveFile(data[0], data[1], data[2], callback);
		
		
	}
	
	public static void saveFile(String name, String validString, String invalidString, QuestionCallback callback){
		
	}
}
