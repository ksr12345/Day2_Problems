import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = num.nextInt();

        int rev = 0;
        while (a != 0){
            int digit = a%10;
            rev = rev*10 + digit;
            a /= 10;
        }
        System.out.println("Reverse Number is: "+ rev);
    }
}
