import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to get the month name: ");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("Month name for number " + monthNumber + " is: January");
                break;
            case 2:
                System.out.println("Month name for number " + monthNumber + " is: February");
                break;
            case 3:
                System.out.println("Month name for number " + monthNumber + " is: March");
                break;
            case 4:
                System.out.println("Month name for number " + monthNumber + " is: April");
                break;
            case 5:
                System.out.println("Month name for number " + monthNumber + " is: May");
                break;
            case 6:
                System.out.println("Month name for number " + monthNumber + " is: June");
                break;
            case 7:
                System.out.println("Month name for number " + monthNumber + " is: July");
                break;
            case 8:
                System.out.println("Month name for number " + monthNumber + " is: August");
                break;
            case 9:
                System.out.println("Month name for number " + monthNumber + " is: September");
                break;
            case 10:
                System.out.println("Month name for number " + monthNumber + " is: October");
                break;
            case 11:
                System.out.println("Month name for number " + monthNumber + " is: November");
                break;
            case 12:
                System.out.println("Month name for number " + monthNumber + " is: December");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 12.");
                break;
        }

        scanner.close();
    }
}

