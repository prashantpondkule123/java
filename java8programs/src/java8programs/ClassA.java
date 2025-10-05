package java8programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClassA {

	public static void main(String[] args) {

		int a = 2536655;

		int leng = new StringBuffer(String.valueOf(a)).toString().length();
		System.out.println(leng); // 7

		int leng1 = String.valueOf(a).length();
		System.out.println(leng1); // 7

		int revNumber = Integer.parseInt(new StringBuffer(String.valueOf(a)).reverse().toString());
		System.out.println(revNumber); // 5566352

		int revNegNum = -12345;
		String revNeggativeString = new StringBuffer(String.valueOf(Math.abs(revNegNum))).reverse().toString();
		System.out.println(revNeggativeString); // 54321
		int revNeggativeNumber = Integer.parseInt(revNeggativeString) * (revNegNum < 0 ? -1 : 1);
		System.out.println(revNeggativeNumber);

		int c[] = { 25, 23, 56, 52 };
		List<Integer> list = IntStream.of(c).boxed().collect(Collectors.toList());
		Collections.sort(list);
		System.out.println(list); // [23, 25, 52, 56]

		Integer[] array = list.toArray(new Integer[0]);
		for (Integer d : array) {
			System.out.print(d + " "); // 23 25 52 56
		}
		System.out.println();

		String[] str = "Prashant Rutuja Adhira".split(" ");
		List<String> strList = Arrays.asList(str);
		Collections.sort(strList);
		System.out.println(strList); // [Adhira, Prashant, Rutuja]

		String str1 = "Prashant Adhira";
		String str2 = str1.replace("a", "*"); // Pr*sh*nt Adhir*
		System.out.println(str2);

		String str3 = str1.replaceAll("[aA]", "*"); // Pr*sh*nt *dhir*
		System.out.println(str3);

		String revEachString = "";
		String str4[] = "Prashant Rutuja Adhira".split(" ");
		for (String e : str4) {
			revEachString += new StringBuffer(e).reverse().toString() + " ";
		}
		System.out.println(revEachString); // tnahsarP ajutuR arihdA

		String str5[] = "Prashant Rutuja Adhira".split(" ");
		StringBuilder revEachString1 = new StringBuilder();
		for (String e : str5) {
			revEachString1.append(new StringBuilder(e).reverse()).append(" ");
		}
		System.out.println(revEachString1.toString().trim()); // tnahsarP ajutuR arihdA

		List<Integer> fibList = Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] }).limit(10)
				.map(f -> f[0]).collect(Collectors.toList());
		System.out.println(fibList); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

		Stream<int[]> as = Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] }).limit(10);
		as.forEach(arr -> System.out.print(Arrays.toString(arr) + " ")); // [0, 1] [1, 1] [1, 2] [2, 3] [3, 5] [5, 8]
																			// [8, 13] [13, 21] [21, 34] [34, 55]

		System.out.println();

		int[] jk = { 78, 25, 56, 75 };
		// Array To List
		List<Integer> intList = IntStream.of(jk).boxed().collect(Collectors.toList());
		Collections.reverse(intList);
		System.out.println(intList); // [75, 56, 25, 78]
		Collections.sort(intList);
		System.out.println(intList); // [25, 56, 75, 78]
		Collections.reverse(intList);
		System.out.println(intList); // [78, 75, 56, 25]

		// List to Array
		int[] array1 = intList.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(array1[0]); // 25
		System.out.println(array1[1]); // 56
		System.out.println(array1[2]); // 75
		System.out.println(array1[3]); // 78

		LinkedList<Integer> linkList = new LinkedList(intList);
		Iterator it = linkList.descendingIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " "); // 78 75 56 25
		}
		System.out.println();

		Integer[] as1 = { 25, 36, 89, 78, 45 };
		Arrays.sort(as1, Collections.reverseOrder());
		String ad = Arrays.toString(as1);
		System.out.println(Arrays.toString(as1)); // [89, 78, 45, 36, 25]

		String ai = "Prashant";
		long count = ai.chars() // Create an IntStream of char values
				.filter(ch -> ch == 'a') // Filter only 'a'
				.count(); // Count the filtered characters
		System.out.println("Number of 'a' in \"" + ai + "\": " + count); // Number of 'a' in "Prashant": 2

		String qw = "Prashant Rushi Prashant Sachin Prashant Rushi";
		long count1 = Arrays.stream(qw.split(" ")).filter(str8 -> str8.equals("Prashant")).count();
		System.out.println("Prashant count is : " + count1); // Prashant count is : 3

		long count2 = Arrays.stream(qw.split("")).filter(str8 -> str8.equals("a")).count();
		System.out.println("a count is : " + count2); // a count is : 7

		List<String> remPrashant = Arrays.stream(qw.split(" ")).filter(str9 -> !str9.equals("Prashant"))
				.collect(Collectors.toList());
		System.out.println(remPrashant); // [Rushi, Sachin, Rushi]
		
		List<String> list3 = Arrays.stream(qw.split(" ")).collect(Collectors.toList());
		list3.removeIf(str6->str6.equals("Prashant"));
		System.out.println(list3); //[Rushi, Sachin, Rushi]

		Set<String> remDup = Arrays.stream(qw.split(" ")).collect(Collectors.toSet());
		System.out.println(remDup); // [Rushi, Prashant, Sachin]

		String add = "Prash5a588nt2";
		long count3 = add.chars().filter(ch -> ch >= '0').filter(ch -> ch <= '9').count();
		System.out.println(count3); // 5

		long doAddDigit = add.chars().filter(ch -> ch >= '0').filter(ch -> ch <= '9').map(ch -> ch - '0').sum();
		System.out.println(doAddDigit); // 28

		int digitSum = add.chars().filter(Character::isDigit).map(ch -> ch - '0') // Convert ASCII digit to actual int
																					// value
				.sum();
		System.out.println(digitSum); // Output: 28
		
		String sortDigit = add.chars().filter(Character::isDigit)
				.mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
		System.out.println(sortDigit); //55882
		
		String sortSmall = "PrashantRuhsISHIKSgjhghJJHJHhjh";
		String sortSmall1 = sortSmall.chars().filter(ch -> ch >= 'a' && ch <= 'z')
				.mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
		System.out.println(sortSmall1); // rashantuhsgjhghhjh

		System.out.println(String.valueOf((char) 65)); // A

		String sortSmall2 = sortSmall.chars().filter(Character::isLowerCase).mapToObj(ch -> String.valueOf((char) ch))
				.collect(Collectors.joining());
		System.out.println(sortSmall2); // rashantuhsgjhghhjh

		String sortUpper = sortSmall.chars().filter(Character::isUpperCase).mapToObj(ch -> String.valueOf((char) ch))
				.collect(Collectors.joining());
		System.out.println(sortUpper); // PRISHIKSJJHJH

		String sortLowecaseString = "prashant Rushikesh SAGAR adhira";
		String sortLowecaseString1 = Arrays.stream(sortLowecaseString.split(" "))
				.filter(str7 -> str7.equals(str7.toLowerCase())).collect(Collectors.joining("*"));
		System.out.println(sortLowecaseString1); // prashant*adhira

		List<String> doAllLowercase = Arrays.stream(sortLowecaseString.split(" ")).map(word -> word.toLowerCase())
				.collect(Collectors.toList());
		System.out.println(doAllLowercase); // [prashant, rushikesh, sagar, adhira]

		List<String> doAllLowercase1 = Arrays.stream(sortLowecaseString.split(" ")).map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println(doAllLowercase1); // [prashant, rushikesh, sagar, adhira]

		List<String> doAllUpperCase = Arrays.stream(sortLowecaseString.split(" ")).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(doAllUpperCase); // [PRASHANT, RUSHIKESH, SAGAR, ADHIRA]

		int[] findMax = { 25, 36, 89, 78, 45 };
		int max = IntStream.of(findMax).max().getAsInt();
		System.out.println(max); // 89

		List<Integer> findMaxList = IntStream.of(findMax).boxed().collect(Collectors.toList());
		int findMaxList1 = findMaxList.stream().max((p1, p2) -> p1 > p2 ? 1 : -1).get();
		System.out.println(findMaxList1); // 89

		int doSum = IntStream.of(findMax).sum();
		System.out.println(doSum); // 273
		
		//Create new Array 1 to 10
		int[] arr = IntStream.rangeClosed(1, 10).toArray();
		for (int i : arr) {
			System.out.print(i + " ");  // 1 2 3 4 5 6 7 8 9 10 
		}
		
		//Create new List 1 to 10
		List<Integer> list2 = IntStream.rangeClosed(1, 10)
                .boxed()   // converts int -> Integer
                .collect(Collectors.toList());
		System.out.println(list2); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		//Create Array of characters
				char [] arr1 = IntStream.rangeClosed('a', 'z')
		                .mapToObj(ch -> String.valueOf((char) ch)) // convert int -> char
		                .collect(Collectors.joining())
		                .toCharArray();
		        System.out.println(arr1[0]);  //a
		        System.out.println(arr1);   //abcdefghijklmnopqrstuvwxyz
		        
		//Create List of characters
		List<Character> list4 = IntStream.rangeClosed('a', 'z')
                .mapToObj(ch -> (char) ch) // convert int -> char
                .collect(Collectors.toList());
        System.out.println(list4); // [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
	}
}
