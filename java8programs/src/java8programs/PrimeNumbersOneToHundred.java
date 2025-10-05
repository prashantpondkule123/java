package java8programs;

import java.util.stream.IntStream;

public class PrimeNumbersOneToHundred {
	
	public static void main(String[] args) {
    System.out.println("Prime numbers between 1 and 100:");

    IntStream.rangeClosed(2, 100)
            .filter(PrimeNumbersOneToHundred::isPrime)
            .forEach(System.out::println);
}

public static boolean isPrime(int number) {
    return number > 1 &&
           IntStream.rangeClosed(2, (int)Math.sqrt(number))
                    .allMatch(n -> number % n != 0);
}
}

