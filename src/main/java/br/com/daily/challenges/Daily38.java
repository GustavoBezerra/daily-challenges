package br.com.daily.challenges;

import java.util.Scanner;

public class Daily38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(formatName(name));
        scanner.close();
	}
	
	public static String formatName(String name) {
		if (name != null) {
            String[] names = name.split(" ");
            if (names.length > 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(names[0]);
                for (int i = 1; i < names.length - 1; i++) {
                    sb.append(" ").append(names[i].toUpperCase().charAt(0)).append(".");
                }
                sb.append(" ").append(names[names.length - 1]);
                name = sb.toString();
            }
        }
		return name;
	}

}
