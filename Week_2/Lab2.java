package Week_2;
import java.util.*;

public class Lab2{

    /**
     * Fill Array
     * 
     * This method will fill the array with 10 random numbers
     * 
     * @param array
     */
    public static void fillArray(int[] array){
        // Traverse the array
        // for loop
        // 0 - n-1
        // Random numbers between 0-20
        for(int i = 0; i < array.length; i++ ){
            // Fill with random numbers
            // (int) (Math.random() * max - min) + min
            int random = (int) (Math.random() * 20);
            array[i] = random;

        }
    }

    /**
     * Above Average
     * 
     * This method will count the number of numbers
     * above average
     * 
     * @param array
     */
    public static int aboveAverage(int[] array){
        // sum
        int sum = 0; // sum = 3;
        // count
        int count = 0;

        // traverse my array [1, 2, 3]
        for(int i = 0; i < array.length; i++){
            // add to sum
            sum += array[i]; // sum = sum + array[i]; 1 = 1 + array[1] = 1 + 2 = 3
        }

        //Calculate the average
        double average = (double) sum/array.length;
        
        // traverse and keep track of numbers above average
        for(int i = 0; i < array.length; i++){
            // keep track of numbers above average
            if( array[i] > average){ 
                count++;
            }
        }

        //return the count of the numbers above average
        return count;
    }

    /**
     * Print 
     * 
     * This method will print out the array
     * @param array
     */
    public static void print(int[] array){
        //Traverse the array
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        
    }
    
    public static void main(String[] args){
        
        //Ask the user for the size of the array
        // 1. Create a Scanner Object
        Scanner input = new Scanner(System.in);
        // 2. Create a Prompt
        System.out.println("Give me a size: ");
        // 3. Input from the user
        int size = input.nextInt();

        //Create an integer array
        int[] array = new int[size];

        // void methods
        fillArray(array);

        print(array);

        // accessor method
        int count = aboveAverage(array);

        System.out.println("\nNumbers above average: " + count);

        //Mod % 
        // 5/2 = 2.5 = 2 goes into 5, 2 times with a remainder of 1
        // 10/3 = 3 goes into 10, 3 times with a remainder of 1
        // 10 % 3 = 1
        
        // even remainder of 0
        // odd remainder of 1



    }
}