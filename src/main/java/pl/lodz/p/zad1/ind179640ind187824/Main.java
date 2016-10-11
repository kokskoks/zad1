package pl.lodz.p.zad1.ind179640ind187824;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) {
		String[] data = getInfo();
		
		QuestionCallback callback = null;
		
		saveFile(data[0], data[1], data[2], callback);
		
		
	}

	protected static String[] getInfo() {
		String[] data = new String[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj nazwe");
		data[0] = scanner.nextLine();
		System.out.println("Podaj poprawny string:");
		data[1] = scanner.nextLine();
		System.out.println("Podaj niepoprawny string:");
		data[2] = scanner.nextLine();
		return data;
	}
	
	public static void saveFile(String name, String validString, String invalidString, QuestionCallback callback){
		File file = new File(name);
		
		boolean success = true;
		try {
			FileUtils.writeStringToFile(file, "Hello World");
		} catch (IOException e) {
			
			success = false;
		}
		
		callback.checkSuccess(success);
		
		
	}
}
