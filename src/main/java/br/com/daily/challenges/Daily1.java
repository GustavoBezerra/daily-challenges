package br.com.daily.challenges;

public class Daily1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String formatString(String phrase) {
		String result = null;
		
		if(phrase != null && phrase.length() > 2) {
			result = phrase.substring(1, phrase.length() - 1);
		}
		
		return result;
	}

}
