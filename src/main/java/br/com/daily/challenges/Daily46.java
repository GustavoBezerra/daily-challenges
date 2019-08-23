package br.com.daily.challenges;

import java.util.Scanner;

public class Daily46 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String result = removeQuestionMarks(scanner.nextLine());
		System.out.println(result);
		scanner.close();
	}

	public static String removeQuestionMarks(String phrase) {
		return phrase.replaceAll("\\?", "");
	}

}
