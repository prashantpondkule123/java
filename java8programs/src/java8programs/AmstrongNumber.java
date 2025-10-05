package java8programs;

public class AmstrongNumber {

    public static void main(String[] args) {
        int OriginalNumber = 153;
        int number = OriginalNumber;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();  // Count the number of digits

        // Calculate the sum of the powers of the digits
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            sum += Math.pow(digit, numberOfDigits);  // Add the power of the digit
            number /= 10;  // Remove the last digit
        }

        // Check if the number is Armstrong
        if (OriginalNumber==sum) {
            System.out.println(OriginalNumber + " is an Armstrong number.");
        } else {
            System.out.println(OriginalNumber + " is not an Armstrong number.");
        }
    }
}
