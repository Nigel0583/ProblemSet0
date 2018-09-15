import javax.swing.*;

public class CalculateLoop {
    public static void main(String[] args) {
        String operation, first, second;
        double firstnum=0, secondnum=0, answer=0;

        operation = JOptionPane.showInputDialog("Please enter desired operator (A, S, M, D):");

        cancel(operation);

        operation.charAt(0);

        while (!"q".equals(operation) || !"Quit".equals(operation)){



            first = JOptionPane.showInputDialog("Please enter the first number:");

            cancel(first);

            second = JOptionPane.showInputDialog("Please enter the second number:");

            cancel(second);

            firstnum = Double.parseDouble (first);
            secondnum = Double.parseDouble (second);



            switch(operation) {
                case "A":
                case "a":
                    answer = firstnum + secondnum;
                    break;

                case "S":
                case "s":
                    answer = firstnum - secondnum;
                    break;

                case "M":
                case "m":
                    answer = firstnum * secondnum;
                    break;

                case "D":
                case "d":
                    answer = firstnum / secondnum;
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Error! Incorrect operator");
            }
            JOptionPane.showMessageDialog(null,  "Answer " +answer);

            operation = JOptionPane.showInputDialog("Please enter desired operator (A, S, M, D):");

            cancel(operation);

            operation.charAt(0);


        }



    }

    private static void cancel(String second) {
        while ("q".equals(second)) {

            int cancel = JOptionPane.showConfirmDialog(null, "Cancel operation", "Exit",
                    JOptionPane.YES_NO_OPTION);

            if (cancel == JOptionPane.YES_OPTION) {
                System.exit(1);

            }
        }


    }
}