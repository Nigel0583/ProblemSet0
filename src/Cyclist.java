import javax.swing.*;

public class Cyclist {
    public static void main(String[] args) {
        String name;
        int distance, threshold = 10, lower = 7, higher = 10, lowertotal=0, highertotal=0;
        name = JOptionPane.showInputDialog("Please enter your first and last name: ");

        distance = Integer.parseInt(JOptionPane.showInputDialog("Please enter the distance you traveled:"));

        if (distance <= threshold) {
             lowertotal = (int) ((10*0.7) + ((distance - 10) * 0.1));
        }
       else {
            highertotal = distance * higher;
        }

                int money = lowertotal + highertotal;


                JOptionPane.showMessageDialog(null, "Name: " + name + "\nDistance: " + distance +
                        "\nMoney Due: " + money + "\nThank you");



    }
}


