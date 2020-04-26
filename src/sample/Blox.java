package sample;

public class Blox {
    String type;
    String color;
    public Blox(String type, String color) {
       this.type = type;
       this.color = color;
    }
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void printBlox() {
        System.out.println(type.charAt(0));
    }
}

