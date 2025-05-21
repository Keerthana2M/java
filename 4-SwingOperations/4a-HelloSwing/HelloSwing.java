// Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
// Programming in Blue color plain font with font size of 32 using Jframe and Jlabel

import java.awt.*;
import javax.swing.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Swing Hello Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);

        // Create the label with the message
        JLabel label = new JLabel("Hello! VI B, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font and color
        label.setFont(new Font("SansSerif", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);

        // Add label to the frame
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }
}

