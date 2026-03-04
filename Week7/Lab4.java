package Week7;

public class Lab4 {
    public static void main(String[] args){
        int[][] array = new int[4][4];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                array[i][j] = (int)(Math.random() * ((1-0)+1));
            }
        }

        printMatrix(array);

        int maxRows = 0;
        int rowIndex = 0;

        for(int i = 0; i < array.length; i++){
            int sum = 0;

            for(int j = 0; j < array[0].length; j++){
                sum += array[i][j]; 
            }

            if(sum > maxRows){
                maxRows = sum;
                rowIndex = i;
            }
        }

        System.out.println("The largest row index = "+ rowIndex);

        int maxColumns = 0;
        int columnIndex = 0;

        for(int i = 0; i < array.length; i++){
            int sum = 0;

            for(int j = 0; j < array[0].length; j++){
                sum += array[j][i]; 
            }

            if(sum > maxColumns){
                maxColumns = sum;
                columnIndex = i;
            }
        }

        System.out.println("The largest column index = "+ columnIndex);


    }

    public static void printMatrix(int[][] m){
        
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}
