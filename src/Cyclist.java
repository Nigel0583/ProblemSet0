import javax.swing.*;

public class Cyclist {
    public static void main(String[] args) {
        String name;
        int distance, money ;
        name = JOptionPane.showInputDialog("Please enter your first and last name: ");

        distance = Integer.parseInt( JOptionPane.showInputDialog("Please enter the distance you traveled:"));

    if (distance < 10 ){
       int total = distance * 7;
}
        JOptionPane.showMessageDialog(null, "Name: " +name+ "\nDistance: " +distance+
                "Money Due: " +money+);

}
