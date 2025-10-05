package java8programs;

import java.util.Arrays;

public class VerifiIsAmagramString {
	public static void main(String[] args) {

		// Way 1 =======================================================
		String str1 = "Listen".toLowerCase();
		String str2 = "Silent".toLowerCase();
		char[] ch = str1.toCharArray();
		for (char e : ch) {
			long countA = str1.chars().filter(f -> f == e).count();
			long countB = str2.chars().filter(f -> f == e).count();
			
			if (countA == countB) {
				System.out.println("This is is Anagram String");
			} else {
				System.out.println("This is Not Anagram String");
			}
		}

		// Way 2 =======================================================

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Above String is Anagram String");
		} else {
			System.out.println("Above String is Not Anagram String");

		}
	}
}
