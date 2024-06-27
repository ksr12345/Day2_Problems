import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = num.nextInt();

        if (a == 1){
            System.out.println("Unit");
        } else if (a == 10) {
            System.out.println("ten");
        } else if (a == 100) {
            System.out.println("hundred");
        } else if (a == 1000) {
            System.out.println("thousand");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
