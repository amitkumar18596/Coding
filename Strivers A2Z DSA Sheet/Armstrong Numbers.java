import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

	}
	public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += Math.pow(lastDigit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
