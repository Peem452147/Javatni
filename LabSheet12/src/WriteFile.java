import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {
    public sealed String input_user() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username : ");
        String username = scanner.next();
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.print("Enter gender : ");
        String gender = scanner.next();
        System.out.print("Enter birth yer : ");
        int birthyer = scanner.nextInt();

        return username + "," + password + "," + gender + "," + birthyer;
    }

    public String data = input_user();

    FileWriter filename = new FileWriter("src/WriteFile/users.txt",true);
    PrintWriter writer = new PrintWriter(filename);

    writer.println("");

    writer.close;

}
