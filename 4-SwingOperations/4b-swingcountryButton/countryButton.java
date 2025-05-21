// Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
// pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
// event handling mechanism with addActionListener( ).

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class countryButton {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Country Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton btnSrilanka = new JButton("Srilanka");
        JButton btnIndia = new JButton("India");

        // Create a label to display the message
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));

        // Add ActionListener to Srilanka button
        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        // Add ActionListener to India button
        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        // Add components to frame
        frame.add(btnSrilanka);
        frame.add(btnIndia);
        frame.add(messageLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
