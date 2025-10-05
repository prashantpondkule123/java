package java8programs;

import java.util.Arrays;

public class FindFirstNonRepeatedChar {

	public static void main(String[] args) {
//Way 1
		String[] a = "success".split("");
		for (int i = 0; i < a.length; i++) {
			String curentString = a[i];
			long count = Arrays.stream(a).filter(ch -> ch.equals(curentString)).count();
			if (count == 1) {
				System.out.println("First non-repeated character is: " + curentString);
				break; // Stop after finding the first one
			}
		}

		// ===============================================================

//Way 2
		String str = "success";
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char currentChar = chars[i];
			long count = str.chars().filter(f -> f == currentChar).count();
			if (count == 1) {
				System.out.println("First non-repeated character is: " + currentChar);
				break; // Stop after finding the first one
			}
		}

// Way 3
		String str1 = "success";
		char[] chars1 = str1.toCharArray();
		for(char ch:chars1) {
			long count = str1.chars().filter(f -> f == ch).count();
			if (count == 1) {
				System.out.println("First non-repeated character is: " + ch);
				break; // Stop after finding the first one
			}
		}
	}
}
