package Week8;
public class Sorting{

    public static void main(String[] args){
        int[] array = {5, 2, 8, 1, 4};

        // selection sort

        // the outer loop iterates through each element of the array, starting from the first element (index 0) to array.length - 1. 
        // The loop variable i represents the current index of the element being sorted.

        for(int i = 0; i < array.length - 1; i++){
            // minIndex keeps track of the smallest element so far in the array through each iteration.
            int minIndex = i;

            // the inner loop starts from the next element (index i + 1) and 
            // iterates through the remaining unsorted portion of the array to find the smallest element.
            for(int j = i + 1; j < array.length; j++){
                // if the element at position j is less than the element at minIndex, we update minIndex to j. 
                // This way, minIndex will always point to the smallest element found so far in the unsorted portion of the array.
                if(array[j] < array[minIndex]){ // descending order: if(array[j] > array[minIndex])
                    minIndex = j;
                }
            }

            // swap the current element with the smallest element found in the inner loop
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        // print sorted array
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}