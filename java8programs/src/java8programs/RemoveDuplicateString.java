package java8programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		String str = "Prashant Adhira Rutuja Prashant Rutuja";
		Set<String> remDup = Arrays.stream(str.split(" ")).collect(Collectors.toSet());
		
		System.out.println(String.join(" ", remDup)); //Prashant Adhira Rutuja 
		
		StringBuffer sb = new StringBuffer();
		for (String a : remDup) {
			sb.append(a).append(" ");
		}
		System.out.println(sb.toString()); // Prashant Adhira Rutuja

		// =========================================================================

		String str1 = "Prashant Sagar Rutuja Prashant Rutuja";

		Set<String> remDup1 = Arrays.stream(str1.split(" "))
				.collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(remDup1); //[Prashant, Sagar, Rutuja]

		String result = String.join(" ", remDup1);
		System.out.println(result); // Prashant Sagar Rutuja

	}
}
