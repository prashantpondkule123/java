package java8programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClassC {
	public static void main(String[] args) {

		int[] arr = IntStream.rangeClosed(1, 10).toArray();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
