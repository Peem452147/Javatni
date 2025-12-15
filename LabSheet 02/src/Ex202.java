import java.util.Scanner;

public class Ex202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter student-id: ");
        String string_id = scan.next();

        scan.nextLine();
        System.out.print("Enter student-name: ");
        String string_name = scan.nextLine();

        System.out.println("\nStudent-id : " + string_id);
        System.out.println("Student-name : " + string_name);
    }
}
