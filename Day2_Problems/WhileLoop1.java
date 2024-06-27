import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = num.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= a){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is: "+ sum);
    }
}
