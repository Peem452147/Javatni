import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int min =Integer.parseInt(
                JOptionPane.showInputDialog("Input minute: "));
        int hours = min / 60;
        int minutes = min %60;

        JOptionPane.showMessageDialog(null,
                min + " minutes is " + hours + " hour " + minutes + "minutes");
    }
}
