package Week7;

public class Lab2 {
    
    public static void main(String[] args){
        int[][] array = new int[8][7];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                array[i][j] = (int)(Math.random() * ((10-1)+1));
            }
        }

        for(int i = 0; i < array.length; i++){
            int hours = 0;
            for(int j = 0; j < array[0].length; j++){
                hours += array[i][j];
            }
            System.out.println("Employee "+ i + " work hour total: " + hours);
        }


    }
}
