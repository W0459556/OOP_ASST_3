package ca.nscc.GUI;
//import ca.nscc.Classes.Rogue;
//import ca.nscc.Classes.Wizard;
//import ca.nscc.Classes.Enemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.Objects;


public class MainFrame extends JFrame {
    public MainFrame() {
        initializeMainFrame();
    }

    private void initializeMainFrame() {
        // Set up the main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Create an empty JPanel to act as a spacer for the center alignment horizontally
        JPanel horizontalSpacerPanel = new JPanel();
        mainPanel.add(horizontalSpacerPanel, BorderLayout.CENTER);

        // Create the label for the image
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource("/ca/nscc/Images/splash.png")));

        // Add the label to the main panel at the top
        mainPanel.add(label, BorderLayout.NORTH);

        // Create the button
        JButton button = new JButton("Create Your Character");
        // Set the preferred height of the button
        button.setPreferredSize(new Dimension(0, 30));

        // Add an ActionListener to the button to handle button clicks
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Replace the current MainFrame with ChooseFrame
                dispose(); // Close the current MainFrame
                new ChooseFrame(); // Open ChooseFrame
            }
        });

        // Add the button to the main panel at the bottom
        mainPanel.add(button, BorderLayout.SOUTH);

        // Add the main panel to the frame
        getContentPane().add(mainPanel);

        // Set the size of the JFrame
        setSize(720, 750);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
