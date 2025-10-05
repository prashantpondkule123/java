package java8programs;

public class MakeUpperToLowerAndLowerToUpper {

	public static void main(String[] args) {
		String input = "PrashanT";

		StringBuilder output = new StringBuilder();
// WAY - 1
//	        for (char ch : input.toCharArray()) {
//	            if (Character.isUpperCase(ch)) {
//	                output.append(Character.toLowerCase(ch));
//	            } else {
//	                output.append(Character.toUpperCase(ch));
//	            }
//	        }

// WAY - 2
		for (char ch : input.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				output.append(String.valueOf((char) ch).toLowerCase());
			} else {
				output.append(String.valueOf((char) ch).toUpperCase());
			}
		}

		System.out.println("Input  : " + input);
		System.out.println("Output : " + output.toString());
	}

}
