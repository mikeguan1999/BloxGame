package sample;

import javafx.scene.paint.Color;

public class Blox {
    String type;
    Color color;


    public Blox(String type, Color color) {
        this.type = type;
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void printBlox() {
        System.out.println(type.charAt(0));
    }
}

