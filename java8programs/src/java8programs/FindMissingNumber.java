package java8programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumber {
	public static void main(String[] args) {
		// Way 1 =======================================================
		int input[] = { 1, 2, 4, 5 };
		int maxVal = IntStream.of(input).max().getAsInt();
		int minVal = IntStream.of(input).min().getAsInt();
		List<Integer> list = IntStream.of(input).boxed().collect(Collectors.toList());
		for (int i = minVal; i <= maxVal; i++) {
			if (!list.contains(i)) {
				System.out.println("Missing number is : " + i); //Missing number is : 3
			}
		}

		// Way 2 =========================================================

		int add = 0;
		for (int i = minVal; i <= maxVal; i++) {
			add = add + i;
		}
		int inputAdd = IntStream.of(input).sum();
		int missingNum = add - inputAdd;
		System.out.println("Missing number is : " + missingNum); //Missing number is : 3
	}
}
