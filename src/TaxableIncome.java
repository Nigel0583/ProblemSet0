import javax.swing.*;

public class TaxableIncome {
    public static void main(String[] args) {

        float taxRate=0;
        double net = 0,  lowerrate = 0.2, higherrate = 0.41, taxMoney = 0, gross;

        JOptionPane.showInputDialog("Please enter your name: ");
        gross = Double.parseDouble((JOptionPane.showInputDialog("Please enter your taxable income:")));

        if (gross <= 20000) {
            net = gross;
            taxRate = 0;
        }

        else if ( gross >= 20000.01 && gross <= 360000 ) {
            taxMoney = gross * lowerrate;
            net = gross - taxMoney;
            taxRate = 20;
        }

         else  {
            taxMoney = gross * higherrate;
            net = gross - taxMoney;
            taxRate = 41;
        }



       JOptionPane.showMessageDialog(null,"Gross income: " +gross+
                " euro\n Tax rate: " +taxRate+"%\nIncome after tax: " +net+ " euro");





    }
}

