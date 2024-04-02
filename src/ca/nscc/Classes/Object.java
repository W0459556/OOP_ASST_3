package ca.nscc.Classes;

public abstract class Object {
    //Declare properties of ANY shape
    private String name;

    public Object(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}