package java8programs;

public class ReverseIntegerJava8 {

	public static void main(String[] args) {
		//int number = 12345;
		int number = -12345;
		
		// Convert the integer to a string, then reverse it using streams
        //String reversedString = new StringBuilder(String.valueOf(number))
        String reversedString = new StringBuilder(String.valueOf(Math.abs(number)))
                                   .reverse()
                                   .toString();
        
        // Handle negative numbers
        int reversedNumber = Integer.parseInt(reversedString);

        // If the original number was negative, make the result negative
        if (number < 0) {
            reversedNumber = -reversedNumber;
        }
        
        System.out.println("Reverse number is : "+reversedNumber);
	}
}
