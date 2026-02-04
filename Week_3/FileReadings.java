package Week_3;
import java.util.*;
import java.io.*;

public class FileReadings{

    public static void main(String[] args) throws FileNotFoundException{

        // File object
        File file = new File("Week_3\\favanimal.csv");

        // Scanner object
        // Scanner reader = new Scanner(new File("Week_3\\favanimal.csv")); 
        Scanner reader = new Scanner(file); 

        // ArrayList
        ArrayList<String> animal = new ArrayList<>();

        // While loop
        while(reader.hasNextLine()){
            //Store data in a string
            String m = reader.nextLine();

            // catherine,whale
            // "catherine" "whale" .split(",")
            // ["catherine", "whale"]
            //    0              1
            String[] data = m.split(",");

            // int a = Integer.parseInt(data[0]); if the data at index 0 was a number
            animal.add(data[1]);
            System.out.println("Name : "+ data[0]);
        }

        System.out.println(animal); //prints array

        // Enhanced for-loop: print out one at a time
        for(String i: animal){
            System.out.println(i);
        }


















        //Enhanced for loop
        // for(String fave: favanimal){
        //     System.out.println(fave);
        // }
        
    }


}