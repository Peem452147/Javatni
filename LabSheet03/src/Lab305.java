import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = kb.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = kb.nextInt();

        // แสดงเฉพาะเลขคู่
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
