package ca.nscc.Classes;
import javax.swing.*;

public abstract class Object {
    //Declare properties of ANY shape
    private String name;
    private ImageIcon shapePic;


    public Object(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageIcon getShapePic() {
        return shapePic;
    }

    public void setShapePic(ImageIcon shapePic) {
        this.shapePic = shapePic;
    }

    public Object(String name, ImageIcon shapePic) {
        this.name = name;
        this.shapePic = shapePic;
    }
}