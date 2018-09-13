import javax.swing.*;

public class Snacks {
    public static void main(String[] args) {
        String name , year;
        int amount;
        name = JOptionPane.showInputDialog("Please enter your name: ");
        year = JOptionPane.showInputDialog("Please enter what year you are in: ");
        amount = Integer.parseInt( JOptionPane.showInputDialog("Please enter how many snacks you want:"));


        int total = amount * 2;

        JOptionPane.showMessageDialog(null, "Name: " +name+ "\nClass: " +year+
                "\nSnacks: " +amount+ "\nTotal:" +total+ "\nThank you");
    }
}
