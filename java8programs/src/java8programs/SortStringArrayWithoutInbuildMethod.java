package java8programs;

public class SortStringArrayWithoutInbuildMethod {

	public static void main(String[] args) {

		String[] str = {"sangram", "prashant", "rushi", "sachin"};

        // Bubble Sort
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (str[j].compareTo(str[j + 1]) > 0) {
                    // Swap str[j] and str[j+1]
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (String s : str) {
            System.out.println(s);
        }	}

}
