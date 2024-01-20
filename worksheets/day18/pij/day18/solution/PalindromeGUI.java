package pij.day18.solution;

import pij.day12.Palindrome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * This class provides a small example of a program using a Swing GUI.
 */
public class PalindromeGUI {

    // some constants to configure the GUI (avoid magic numbers)
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int COLUMN_WIDTH = 20;

    /**
     * Constructs all the components for our GUI, puts them into
     * a suitably configured JFrame, and makes the JFrame visible.
     */
    public PalindromeGUI() {
        // set up all the components of the GUI
        JLabel instructionLabel = new JLabel("Please enter some text! We will tell you if it is a palindrome.");
        JLabel outputLabel = new JLabel(); // empty at first
        JTextField inputTextField = new JTextField(COLUMN_WIDTH); // inputs can be longer!
        JButton button = new JButton("Check!");
        JCheckBox useRecursionCheckBox = new JCheckBox("Use recursion?");

        ActionListener listener = (ae) -> {
            String s = inputTextField.getText();
            boolean useRecursion = useRecursionCheckBox.isSelected();
            boolean isPalindrome;
            if (useRecursion) {
                isPalindrome = Palindrome.isPalindrome(s);
            } else {
                isPalindrome = Palindrome.isPalindromeLoop(s);
            }
            String answer = s + " is " + (isPalindrome ? "indeed " : "not ") + "a palindrome";
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
        jFrame.add(useRecursionCheckBox);
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
        useRecursionCheckBox.setFont(newFont);
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
        SwingUtilities.invokeLater(PalindromeGUI::new);
        // alternative:
        //SwingUtilities.invokeLater(() -> new MyFirstGUI());
    }
}
