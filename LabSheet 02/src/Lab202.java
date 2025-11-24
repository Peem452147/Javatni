import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = scan.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = scan.nextInt();

        System.out.println("Summation = " +(number1 + number2));
        System.out.println("Subtraction = " +(number1 - number2));
        System.out.println("Multiplication = " +(number1 * number2));
        System.out.println("Division = " +((double) number1 / number2));
        System.out.println("Modulus = " +(number1 % number2));
    }
}


