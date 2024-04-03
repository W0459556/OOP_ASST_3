package ca.nscc.GUI;

import ca.nscc.Classes.Rogue;
import ca.nscc.Classes.Wizard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChooseFrame extends JFrame {
    private JLabel characterImageLabel;
    private JTextField nameTextField;
    private JTextArea infoTextArea;

    public ChooseFrame() {
        initializeChooseFrame();
    }

    private void initializeChooseFrame() {
        setTitle("Choose Your Character");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(720, 750);
        setLayout(null); // Setting layout to null
        setLocationRelativeTo(null);

        // Label for "Enter Character Name:"
        JLabel nameLabel = new JLabel("Enter Character Name: ");
        nameLabel.setBounds(10, 10, 300, 20); // Setting bounds for label
        add(nameLabel);

        // Text field for character name
        nameTextField = new JTextField();
        nameTextField.setBounds(10, 35, 100, 20); // Setting bounds for text field
        add(nameTextField);

        // Wizard radio button
        JRadioButton wizardRadioButton = new JRadioButton("Wizard");
        wizardRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                characterImageLabel.setIcon(new ImageIcon(getClass().getResource("/ca/nscc/Images/wizard.png")));
                updateInfo();
            }
        });
        wizardRadioButton.setBounds(10, 60, 100, 20); // Setting bounds for radio button
        add(wizardRadioButton);

        // Rogue radio button
        JRadioButton rogueRadioButton = new JRadioButton("Rogue");
        rogueRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                characterImageLabel.setIcon(new ImageIcon(getClass().getResource("/ca/nscc/Images/rogue.png")));
                updateInfo();
            }
        });
        rogueRadioButton.setBounds(120, 60, 100, 20); // Setting bounds for radio button
        add(rogueRadioButton);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(wizardRadioButton);
        group.add(rogueRadioButton);

        // Image label
        characterImageLabel = new JLabel();
        characterImageLabel.setPreferredSize(new Dimension(100, 150));
        characterImageLabel.setHorizontalAlignment(SwingConstants.LEFT);
        characterImageLabel.setBounds(10, 85, 100, 150); // Setting bounds for image label
        add(characterImageLabel);

        // Info text area
        infoTextArea = new JTextArea();
        infoTextArea.setEditable(false);
        infoTextArea.setLineWrap(true); // Set line wrap to true to make text wrap
        infoTextArea.setWrapStyleWord(true); // Wrap at word boundaries
        infoTextArea.setPreferredSize(new Dimension(200, 50)); // Adjusted width to 200 pixels
        infoTextArea.setBounds(10, 240, 200, 50); // Setting bounds for text area
        add(infoTextArea);

        setVisible(true);
    }

    private void updateInfo() {
        String characterName = nameTextField.getText();
        String characterInfo = "";
        if (characterName != null && !characterName.trim().isEmpty()) {
            characterInfo += "Character Name: " + characterName + "\n";
        }

        // Append additional character info
        // For simplicity, let's assume the character classes (Wizard and Rogue) have overridden toString method
        if (characterImageLabel.getIcon() != null) {
            if (characterImageLabel.getIcon().toString().contains("wizard")) {
                Wizard wizard = new Wizard();
                characterInfo += wizard.toString();
            } else if (characterImageLabel.getIcon().toString().contains("rogue")) {
                Rogue rogue = new Rogue();
                characterInfo += rogue.toString();
            }
        }

        infoTextArea.setText(characterInfo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChooseFrame::new);
    }
}
