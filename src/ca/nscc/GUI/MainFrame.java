package ca.nscc.GUI;
import ca.nscc.Classes.Rogue;
import ca.nscc.Classes.Wizard;
import ca.nscc.Classes.Enemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private static Wizard theWizard;
    private static Rogue theRogue;
    private static Enemy theEnemy;

    public MainFrame() {    //Constructor

        //Set Frame Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 750, 750);
        setTitle("Shapetastic!");
        setLayout(new CardLayout());

        //Create my pre-defined shape objects at start of program
        theWizard = new Wizard(null, null, null, 0, 0, null, null, 0);
        theRogue = new Rogue(null, null, null, 0, 0, null, null, 0);
        theEnemy = new Enemy(null, null, null, 0, 0, null, null);

        //Add Panel "screens"
        ChoosePanel chooseScreen = new ChoosePanel();
        DisplayPanel displayScreen = new DisplayPanel();
        add(chooseScreen);
        add(displayScreen);

        JButton displayButton = chooseScreen.getDisplayBtn();
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseScreen.createFinalShape();
                //Display the chosen object text on the Display screen
                displayScreen.displayUserChoice();
                chooseScreen.setVisible(false);
                displayScreen.setVisible(true);
            }
        });
    }

    public static Wizard getTheWizard() {
        return theWizard;
    }

    public static void setTheWizard(Wizard theWizard) {
        MainFrame.theWizard = theWizard;
    }

    public static Rogue getTheRogue() {
        return theRogue;
    }

    public static void setTheRogue(Rogue theRogue) {
        MainFrame.theRogue = theRogue;
    }

    public static Enemy getTheEnemy() {
        return theEnemy;
    }

    public static void setTheEnemy(Enemy theEnemy) {
        MainFrame.theEnemy = theEnemy;
    }
}