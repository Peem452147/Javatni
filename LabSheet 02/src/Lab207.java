import javax.swing.*;
import java.text.DecimalFormat;

public class Lab207 {
    public static void main(String[] args) {
        final double HOURLY_RATE = 7.50;
        final double TAX_RATE = 0.15;
        DecimalFormat frm = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null,
                "Welcome to the payroll application");
        String emloyee_name = (JOptionPane.showInputDialog("Enter employee namre:"));
        int houm_employee = Integer.parseInt(JOptionPane.showInputDialog("Enter total hour for this employee"));
        double earnings = houm_employee + HOURLY_RATE;
        double tex = earnings * TAX_RATE;
        double net_earnings = earnings - tex;
        JOptionPane.showMessageDialog(null,
                "Employee name: " + emloyee_name +
                "\nHour worked: " + houm_employee +
                "\nHourly wage: $"+frm.format(HOURLY_RATE) +
                "\nGross earnings : $"+frm.format(earnings) +
                "\nTex rate: "+TAX_RATE +
                "\nTex: $"+ frm.format(tex) +
                "\nNet earnings: $"+ frm.format(net_earnings));
        }
    }

