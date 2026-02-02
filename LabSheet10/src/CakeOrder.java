import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        //1
        System.out.println("Birthday Cake'sDetails");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor = scanner.next();
        System.out.print("How many pound: ");
        double pound =scanner.nextDouble();

        //2
        BirthdayCake order1 =new BirthdayCake(message,pound,flavor,350);

        //3
        System.out.println(order1);
        System.out.println();

        //4
        System.out.println("Cup Cake's Details: ");
        System.out.println("Enter a flavor: ");
        String cup_flavor = scanner.next();
        System.out.println("How many piece: ");
        int piece = scanner.nextInt();

        //5
        CupCake order2 = new CupCake(piece,cup_flavor,65);

        //6
        System.out.println(order2);

        //7
        System.out.println("Total price = " +
                (order1.getUnitPrice()*pound + order2.getUnitPrice()*piece));
        
    }
}
