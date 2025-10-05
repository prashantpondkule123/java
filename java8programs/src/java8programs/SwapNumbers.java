//Swap two numbers without a temp variable

package java8programs;

public class SwapNumbers {
	
	 public static void main(String[] args) {
	        int a = 5, b = 10;

	        System.out.println("Before Swap: a = " + a + ", b = " + b);

	        a = a + b;  // a = 5+10 = 15
	        b = a - b;  // b = 15-10 = 5
	        a = a - b;  // a = 15-5 = 10

	        System.out.println("After Swap: a = " + a + ", b = " + b);
	    }
}
