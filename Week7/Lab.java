package Week7;
import java.util.*;

public class Lab {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row");

        double[][] array = new double[3][4];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                array[i][j] = input.nextDouble();
            }
        }
       
        System.out.println("Enter a column index: ");
        int columnIndex = input.nextInt();

        System.out.println("Sum of the elements at column " + columnIndex + " is " + sumColumn(array, columnIndex) );

        // For each column
        for(int i = 0; i < 4; i++){
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(array, i) );

        }
    
    }

    public static double sumColumn(double[][] m, int columnIndex){
        
        double sum = 0;

        for(int i = 0; i < m.length; i++){
            sum += m[i][columnIndex];
        }

        return sum;
    }
}
