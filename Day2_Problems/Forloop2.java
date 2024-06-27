import java.util.Scanner;

public class Forloop2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = num.nextInt();
        int rev;
        for(rev = 0; a != 0; a/= 10){
            int digit = a%10;
            rev = rev*10 + digit;
        }
        System.out.println("Reverse Number is: "+ rev);
    }
}
