package java8programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class ClassB{
	
	public static void main(String[] args) {
		String str = "Total employees are 15,055 in the company";
				int septemberAddition = 45;
				
//				Expected output
//				Total employees are 15,100 in the company
				 
				String numStr = "";
				for(int i=0; i<str.length();i++){
				if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				numStr=numStr+str.charAt(i);
				}
				}
				int add = Integer.parseInt(numStr)+septemberAddition;
				 
				String strAdd = String.valueOf(add);
				 
				String outStr = str.replace("15,055", strAdd);
				System.out.println(outStr);
 
				String str1 = str.chars().filter(f->f>=48&&f<=56)
						.mapToObj(f->String.valueOf((char)f))
						.collect(Collectors.joining());
				System.out.println(str1);
				
				List<Integer> list = str.chars()                 // IntStream
					    .filter(Character::isDigit)
					    .map(Character::getNumericValue)             // still IntStream
					    .boxed()                                     // → Stream<Integer>
					    .collect(Collectors.toList());  
				System.out.println(list);
				System.out.println("=====================================");
				
				String a = "success";
					Set<String> set = a.chars().mapToObj(f->String.valueOf((char)f)).collect(Collectors.toSet());
					System.out.println(set);
					String SetString = set.stream().collect(Collectors.joining());
					System.out.println(SetString);
				}
	
}
