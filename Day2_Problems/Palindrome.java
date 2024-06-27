import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = num.nextInt();

        if (isPalindrome(a)) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("Its not a Palindrome");
        }
    }
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }


        return number == reversedNumber;
    }
}
