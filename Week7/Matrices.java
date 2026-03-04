package Week7;

public class Matrices {
    
    public static void main(String[] args){
        // array
        // int[] array = {1,2,3,4,5};
        // for(int i = 0; i < array.length; i++){
        //     System.out.println(array[i]);
        // }

        // A 2D array is an array of arrays. It is a table of values consisting of rows and columns.

        int[][] array2 = {{1,2,3,4}, //row 0: col 0 = 1, col 1 = 2, col 2 = 3, col 3 = 4
                          {4,5,6,5}, //row 1: col 0 = 4, col 1 = 5, col 2 = 6, col 3 = 5
                          {7,8,9,6}}; //row 2: col 0 = 7, col 1 = 8, col 2 = 9, col 3 = 6

        int[][] matrix = new int[3][4]; // 3 rows x 4 columns
        

        // adding values to 2D array 
        for(int i = 0; i < array2.length; i++){ 
            for(int j = 0; j < array2[i].length; j++){
                matrix[i][j] = (int)(Math.random() * (10-0));
            }
        }

        // print 2D array
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }

    }
