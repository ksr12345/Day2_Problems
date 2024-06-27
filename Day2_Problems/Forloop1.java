import java.util.Scanner;

public class Forloop1 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = num.nextInt();

        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum = sum + i;
        }
        System.out.println("Sum is: "+ sum);
    }
}
