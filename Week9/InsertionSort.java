package Week9;

public class InsertionSort {

    public static void main(String[] args){
        // Algorithm: Insertion Sort

        // Assume the index 0 is sorted

        // 1. Let the first unsorted element be x

        // 2. Compare x with elements in unsorted area from right to left till index 0
            // a. If x < an element, then shift that element one position and repeat step 2
            // b. If x !< an element, then break and place x in correct position
        
        // 3. Increase sorted area by one

        // 4. Repeat steps 1-2 until n-1, where n = array.length

        int[] array = {2,9,5,4,8,1,6};

        for(int i = 1; i < array.length; i++){ // cycle 1
            int currentElement = array[i]; // 9
            int j; 
            for(j = i-1; j >= 0 && array[j] > currentElement; j--){ // j = 0
                array[j+1] = array[j];
            }
            array[j + 1] = currentElement;
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    
}
