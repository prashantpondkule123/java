package java8programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeriesJava8 {

	public static void main(String[] args) {
		int n = 10;
		
		List<Integer> list = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}) // Fibonacci logic
                                   .limit(n) // Limit the number of terms
                                   .map(f -> f[0]) // Extract the first number of the pair
                                   .collect(Collectors.toList()); // Collect as List
		System.out.println(list);
	}
}
