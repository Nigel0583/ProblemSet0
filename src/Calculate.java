import javax.swing.*;

public class Calculate {
    public static void main(String[] args) {
        String operation, first, second;
        double firstnum, secondnum, answer=0;

        operation = JOptionPane.showInputDialog("Please enter desired operator (A, S, M, D):");
        operation.charAt(0);

        first = JOptionPane.showInputDialog("Please enter the first number:");
        second = JOptionPane.showInputDialog("Please enter the second number:");

        firstnum = Double.parseDouble (first);
        secondnum = Double.parseDouble (second);

        switch(operation) {
            case "A":
                answer = firstnum + secondnum;
                break;

            case "S":
                answer = firstnum - secondnum;
                break;

            case "M":
                answer = firstnum * secondnum;
                break;

            case "D":
                answer = firstnum / secondnum;
                break;

            default:
                JOptionPane.showMessageDialog(null,"Error! Incorrect operator");
        }
        JOptionPane.showMessageDialog(null,  "Answer" +answer);


    }
}
