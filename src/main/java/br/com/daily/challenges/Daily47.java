package br.com.daily.challenges;

import java.util.Scanner;

/**
 * <a>https://dev.to/thepracticaldev/daily-challenge-47-alphabets-4cbn</a>
 * @author Gustavo
 * @date 2019-08-22
 *
 */
public class Daily47 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String phrase = scanner.nextLine();
		System.out.println(convertToNumbers(phrase));
		scanner.close();
	}

	public static String convertToNumbers(String phrase) {
		StringBuilder sb = new StringBuilder();
		if(phrase != null) {
			for(char letter : phrase.toUpperCase().toCharArray()) {
				if(letter >= 65 && letter <= 90) {
					sb.append(letter - 64);
					sb.append(" ");
				}
			}
		}
		return sb.substring(0, sb.length()-1).toString();
	}

}
