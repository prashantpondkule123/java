package java8programs;

import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupCharactersFromString {

	public static void main(String[] args) {
		//Way 1
		String a = "success";
		Set<String> set = a.chars().mapToObj(f->String.valueOf((char)f)).collect(Collectors.toSet());
		System.out.println(set); //[s, c, u, e]
		String SetString = set.stream().collect(Collectors.joining());
		System.out.println(SetString); //scue
		
	}
}
