package java8programs;

public class ReverseStringWithoutUsingInbuildMethodsAndAnotherVariable {
	public static void main(String[] args) {

		String str = "Prashant";
		str = str + "#";
		for (int i = str.length()-1; i >= 0; i--) {
			str += str.charAt(i);
		}
		System.out.println(str); //Prashant##tnahsarP

		str = (str.split("##"))[1];
		System.out.println(str); //tnahsarP
	}
}
