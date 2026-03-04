package Week7;

public class Matrices {
    
    public static void main(String[] args){

        int[] array = {1,2,3,4,5};
        int[][] array2 = {{1,2,3}, //row 1 - 1 is col 0, 2 is col 1
                          {4,5,6}, //row 2
                          {7,8,9}}; //row 3
        // array
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        // 2D array
        for(int i = 0; i < array2.length; i++){ 
            for(int j = 0; j < array2[i].length; j++){
                System.out.print(array2[i][j]);
            }
            System.out.println();
        }
        }





    }
