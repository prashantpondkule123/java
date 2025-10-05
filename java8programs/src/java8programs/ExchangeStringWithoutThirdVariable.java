package java8programs;

public class ExchangeStringWithoutThirdVariable {

	public static void main(String[] args) {
		 String a = "Sagar";
	        String b = "Prashant";

	        System.out.println("Before Swap: a = " + a + ", b = " + b);

	        // Step 1: Join both strings
	        a = a + b;   // "SagarPrashant"

	        // Step 2: Extract original 'a' using substring
	        System.out.println(a.substring(0,5)); //Sagar
	        b = a.substring(0, a.length() - b.length());  //a.length() - b.length() = 13-8=5


	        // Step 3: Extract original 'b' using substring
	        System.out.println(a.substring(5)); //Prashant
	        a = a.substring(b.length()); //b.length()=5

	        System.out.println("After Swap:  a = " + a + ", b = " + b);
	}
}
