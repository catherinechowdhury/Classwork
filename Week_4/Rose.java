package Week_4;
// Extends > is a
// Rose is a Flower
public class Rose extends Flower {
    // Additional attribute for Rose
    private String fragrance;

    // Default constructor
    public Rose() {
        // 1. super must be the first statement in the constructor
        // 2. The parent class must have a default constructor for this to work
        super(); // Call the default constructor of the Flower class
        this.fragrance = "sweet";
    }

    // Constructor with parameters
    public Rose(String name, String color, int petals, String fragrance) {
        super(name, color, petals); // Call the parameterized constructor of the Flower class
        this.fragrance = fragrance;
    }

    // Getter and Setter for fragrance
    public String getFragrance() {
        return fragrance;
    }

    public void setFragrance(String fragrance) {
        this.fragrance = fragrance;
    }

    // Override the displayInfo method to include fragrance information
    // Java decides which overridden method to run at runtime, based on the object, not the variable.
    // The @Override annotation indicates that this method is overriding a method from the parent class
    
    // Method Overloading - two methods have the same name 
    // BUT they do not have the same
    // arguments
    public void displayInfo(String name){

    }
    // Method overriding 
    // Same method statement - method name and arguments as the parent
    @Override
    public void displayInfo() {
        // super calls the parent
        super.displayInfo(); // Call the displayInfo method of the Flower class
        System.out.println("Fragrance: " + fragrance);
    }   
    
    public static void main(String[] args) {
        // Create an instance of Rose using the default constructor
        Rose defaultRose = new Rose(); 
        System.out.println("Default Rose:");
        defaultRose.displayInfo();

        // Create an instance of Rose using the parameterized constructor
        Rose customRose = new Rose("rose", "red", 12, "floral");
        System.out.println("\nCustom Rose:");
        customRose.displayInfo();

        // super cannot be used inside static methods
        // super.displayInfo();
    }
}
