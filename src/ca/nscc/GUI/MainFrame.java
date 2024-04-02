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

    private static int selectedColor = 0;

    public MainFrame() {    //Constructor

        //Set Frame Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 750, 750);
        setTitle("Shapetastic!");
        setLayout(new CardLayout());

        //Create my pre-defined shape objects at start of program
        theCircle = new Circle(null, 10);
        theRectangle = new Rectangle(null, 5, 8);
        theTriangle = new Triangle(null, 12, 19);

        //Create a list of predefined colors at start of program
        colorsList.add(new ShapeColor("Red", 255, 0, 0));
        colorsList.add(new ShapeColor("Green", 0, 255, 0));
        colorsList.add(new ShapeColor("Blue", 0, 0, 255));
        colorsList.add(new ShapeColor("Purple", 155, 0, 155));

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

    public static Circle getTheCircle() {
        return theCircle;
    }

    public static Rectangle getTheRectangle() {
        return theRectangle;
    }

    public static Triangle getTheTriangle() {
        return theTriangle;
    }

    public static ArrayList<ShapeColor> getColorsList() {
        return colorsList;
    }

    public static int getSelectedColor() {
        return selectedColor;
    }

    public static void setSelectedColor(int selectedColor) {
        MainFrame.selectedColor = selectedColor;
    }
}