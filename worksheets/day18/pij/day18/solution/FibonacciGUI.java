package pij.day18.solution;

import pij.day12.FibLoop;
import pij.day12.Fibonacci;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * This class provides a small example of a program using a Swing GUI.
 */
public class FibonacciGUI {

    // some constants to configure the GUI (avoid magic numbers)
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int COLUMN_WIDTH = 20;

    /**
     * Constructs all the components for our GUI, puts them into
     * a suitably configured JFrame, and makes the JFrame visible.
     */
    public FibonacciGUI() {
        // set up all the components of the GUI
        JLabel instructionLabel = new JLabel("Please enter a non-negative number!");
        JLabel outputLabel = new JLabel(); // empty at first
        JTextField inputTextField = new JTextField(COLUMN_WIDTH); // inputs can be longer!
        JButton button = new JButton("Fibonacci!");
        String[] names = { "recursive simple", "recursive memo", "iterative" };
        JList<String> jList = new JList<>(names);


        ActionListener listener = (ae) -> {
            String s = inputTextField.getText();
            int selectedIndex = jList.getSelectedIndex();
            int n;
            // beware of user input that may be harmful!
            try {
                n = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                String msg = s + " is not a number, please try again!";
                outputLabel.setText(msg);
                return;
            }
            if (n < 0) {
                String msg = s + " is not a non-negative number, please try again!";
                outputLabel.setText(msg);
                return;
            }
            // maybe check for large values with slow algorithms

            long result;
            switch (selectedIndex) {
                case 0:
                    result = Fibonacci.fib(n);
                    break;
                case 1:
                    result = pij.day14.Fibonacci.fib(n);
                    break;
                case 2:
                    result = FibLoop.fibIterative(n);
                    break;
                default:
                    throw new RuntimeException("Unexpected JList index: " + selectedIndex);
            }

            String answer = names[selectedIndex] + " says: fib(" + n + ") = " + result;
            outputLabel.setText(answer);
        };

        // ActionListener is a functional interface, so we can implement it
        // with a lambda expression
        inputTextField.addActionListener(listener);
        button.addActionListener(listener);

        // everything will be shown in a JFrame (it's like a window)
        JFrame jFrame = new JFrame("Hello, World!");
        jFrame.setLayout(new FlowLayout()); // reasonable "first default choice"
        jFrame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // vary the constants for your needs

        // when the window closes, the program should terminate
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // now put the components into the JFrame in the desired order
        jFrame.add(instructionLabel);
        jFrame.add(jList);
        jFrame.add(inputTextField);
        jFrame.add(button);
        jFrame.add(outputLabel);

        // On modern displays with high pixel density, the default size of
        // the fonts for the components may be a bit small. Let's help them:

        // retrieve the current font...
        Font oldFont = UIManager.getFont("Label.font");
        // ...and make it twice as large (note the cast to float!)...
        Font newFont = oldFont.deriveFont((float) (oldFont.getSize()*2));
        // ...and tell the relevant components about it
        instructionLabel.setFont(newFont);
        outputLabel.setFont(newFont);
        jList.setFont(newFont);
        inputTextField.setFont(newFont);
        button.setFont(newFont);

        // actually show the JFrame
        jFrame.setVisible(true);
    }

    /**
     * Runs the Swing GUI for our example.
     */
    public static void main(String[] args) {
        // use a method reference to the constructor (!) for the code to run
        // by the GUI thread; it can be used as a Runnable, too
        SwingUtilities.invokeLater(FibonacciGUI::new);
        // alternative:
        //SwingUtilities.invokeLater(() -> new MyFirstGUI());
    }
}
