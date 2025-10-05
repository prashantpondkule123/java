package java8programs;

import java.util.stream.IntStream;

public class FactorialWithStream {

	public static void main(String[] args) {
		
		 int number = 5; // Change this to any number

	        long factorial = IntStream.rangeClosed(1, number)
	                                  .reduce(1, (a, b) -> a * b);

	        System.out.println("Factorial of " + number + " is: " + factorial);
	}

}
