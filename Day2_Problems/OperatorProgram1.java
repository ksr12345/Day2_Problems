import java.util.Scanner;

public class OperatorProgram1 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        System.out.println(a + b * c);
        System.out.println(c + a / b);
        System.out.println(a % b + c);
        System.out.println(a * b + c);

        if (a > b){
            if (a > c){
                System.out.println(a +" is max.");
            } else {
                System.out.println(c + " is max.");
            }
        } else {
            if (b > c){
                System.out.println(b +" is max.");
            } else {
                System.out.println(c + " is max.");
            }
        }
        if (a < b){
            if (a < c){
                System.out.println(a +" is min.");
            } else {
                System.out.println(c + " is min.");
            }
        } else {
            if (b < c){
                System.out.println(b +" is min.");
            } else {
                System.out.println(c + " is min.");
            }
        }
    }
}
