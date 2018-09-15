import javax.swing.*;

public class Cyclist {
    public static void main(String[] args) {
        String name;
        int distance, threshold = 10, lower = 7, higher = 10, total=0;
        name = JOptionPane.showInputDialog("Please enter your first and last name: ");

        distance = Integer.parseInt(JOptionPane.showInputDialog("Please enter the distance you traveled:"));

        if (distance <= threshold) {
             total =  distance * 7;
        }
       else {
            total  = (int) ((10*7) + (distance - 10) * 10);
        }

                JOptionPane.showMessageDialog(null, "Name: " + name + "\nDistance: " + distance +
                        "\nMoney Due: " + total + "\nThank you");



    }
}


