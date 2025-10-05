package java8programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindNonCommonValues {
	
	public static void main(String[] args) {
		
		int [] a = {10,11,13,14,36};
		int [] b = {14,11,12,10,13};
		
		List<Integer>listA = IntStream.of(a).boxed().collect(Collectors.toList());
		List<Integer>listB = IntStream.of(b).boxed().collect(Collectors.toList());
		
		List<Integer>listADup = new ArrayList<>(listA);
		List<Integer>listBDup = new ArrayList<>(listB);
		
		List<Integer>nonCommon = new ArrayList<>();
		
		listADup.removeAll(listB);
		listBDup.removeAll(listA);

		nonCommon.addAll(listADup);
		nonCommon.addAll(listBDup);

		System.out.println(nonCommon);
		
		listB.retainAll(listA);
		System.out.println(listB);
	}

}
