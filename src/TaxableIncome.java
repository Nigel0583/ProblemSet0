import javax.swing.*;

public class TaxableIncome {
    public static void main(String[] args) {
        String name;
        float taxable, net, gross=0;
        double lowerrate = 0.2, higherrate = 0.41;

        name = JOptionPane.showInputDialog("Please enter your name: ");
        taxable = Float.parseFloat(JOptionPane.showInputDialog("Please enter your taxable income:"));

        if (taxable > 0 && taxable <= 20000) {
            taxable = gross;
            JOptionPane.showMessageDialog(null, "Name: " +name+ "Gross income" +gross+
                    "");
        }
    }
}

