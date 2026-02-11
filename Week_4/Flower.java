package Week_4;

public class Flower {
    // Attributes
    private String name;
    private String color;
    private int petals;

    // Default constructor
    public Flower() {
        this.name = "daisy";
        this.color = "yellow";
        this.petals = 10;
    }
    // Constructor
    public Flower(String name, String color, int petals) {
        this.name = name;
        this.color = color;
        this.petals = petals;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }   

    public void setName(String name) {
        this.name = name;
    }
     public String getColor() {
        return color;
    }   
    public void setColor(String color) {
        this.color = color;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    // Method to display flower information
    public void displayInfo() {
        System.out.println("Flower Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Number of Petals: " + petals);
    }
}
