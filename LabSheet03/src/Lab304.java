import javax.swing.*;

public class Lab304 {
    public static void main(String[] args) {

        String w = JOptionPane.showInputDialog("Enter your weight (kg.):");
        double weight = Double.parseDouble(w);

        String h = JOptionPane.showInputDialog("Enter your height (cm.):");
        double heightCm = Double.parseDouble(h);

        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);

        String result = "";

        if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi < 25) {
            result = "Healthy Weight";
        } else if (bmi < 30) {
            result = "Overweight";
        } else {
            result = "Obese";
        }

        JOptionPane.showMessageDialog(null,
                "Your BMI is " + String.format("%.2f", bmi) +
                        "\nBMI result is " + result);
    }
}



