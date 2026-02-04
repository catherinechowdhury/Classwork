package Week_3;
import java.util.*;

public class Lab {
    //Attribute: our hidden data
    private String name;
    private int age;

    // Default Constructor
    public Lab(){
        this.name = "Catherine";
        this.age = 32;
    }

    // Constructor where user inputs arguments
    public Lab(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Get methods returns data
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    //Set a name
    public void setName(String name){
        this.name = name;
    }

    //Set age
    public void setAge(int x){
        this.age = age;
    }

    //Print
    public String toString(){
        return "Name : " + name + " Age :" + age;
    }

    public static void main(String[] args){
        Lab example = new Lab();

        System.out.println(example);

        // OR you can have a user give you the inputs
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        Lab newLab = new Lab(name, age);

        System.out.println(newLab);

        input.close();

    }

}
