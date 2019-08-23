package br.com.daily.challenges;

import java.util.Scanner;

/**
 * <a>https://dev.to/thepracticaldev/daily-challenge-1-string-peeler-4nep</a>
 * @author Gustavo
 * @date 2019-08-22
 * 
 */
public class Daily1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(formatString(name));
        scanner.close();
	}

	public static String formatString(String phrase) {
		String result = null;
		
		if(phrase != null && phrase.length() > 2) {
			result = phrase.substring(1, phrase.length() - 1);
		}
		
		return result;
	}

}
