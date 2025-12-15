public class Ex401 {
    public static void main(String[] args) {
        String massage = "INT-108 Objiect-Oriented Programming 2025";

        System.out.println("Length message = " + massage.length());

        System.out.println("Uppercase = " + massage.toLowerCase());
        System.out.println("Lowercase = " + massage.toLowerCase());

        System.out.println("First Letter = " + massage.charAt(0));
        System.out.println("First Letter = " + massage.substring(0,1));

        System.out.println("Last Letter = " + massage.charAt(massage.length()-1));
        
    }
}
