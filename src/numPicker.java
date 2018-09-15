import javax.swing.*;


public class numPicker {
    public static void main(String[] args) {
        String numberAsString;
        int numberCount=0, sum=0, number;

        numberAsString = JOptionPane.showInputDialog("Please enter a number - positive " +
                "negative or zero. Enter q to quit");


        while(!"q".equals((numberAsString))){

            numberCount++;

            number = Integer.parseInt(numberAsString);
            sum += number;

            numberAsString = JOptionPane.showInputDialog("Please enter a number - positive " +
                    "negative or zero. Enter q to quit");

        }

        JOptionPane.showMessageDialog(null,"The grand total is " +numberCount+
                "\nThe number of entries typed: " +sum);
    }


}
