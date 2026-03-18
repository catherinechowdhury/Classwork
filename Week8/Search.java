package Week8;

public class Search {
    public static void main(String[] args){

        int[] array = {5, 2, 8, 1, 4};
        // Binary search requires the array to be sorted. We can use the selection sort algorithm to sort the array before performing binary search.
        
        int target = 8;
        boolean found = false;

        // Create a left and right pointer to keep track of the current search range. The left pointer starts at the beginning of the array (index 0) and the right pointer starts at the end of the array (index array.length - 1).
        int left = 0;
        int right = array.length - 1;

        // We will continue to search as long as the left index is less than or equal to the right index. If the left index exceeds the right index, it means we have searched the entire array and the target value is not found.

        // EX: array = {1, 2, 4, 5, 8}
        // left = 0 index, right = 4 index
        while(left <= right){

            // We calculate the middle index of the current search range using the formula: mid = left + (right - left) / 2. This formula helps to avoid potential overflow issues that can occur with large arrays.
            int mid = left + (right - left) / 2;

            // Compare targed with the middle element of the array
            // if the middle element is equal to the target value, we have found the target and we can set the found variable to true and break out of the loop.
            if(array[mid] == target){
                found = true;
                break;

            // if the middle element is less than target, then that means our target will be in the right half of the array because those values will be greater than the middle element. 
            } else if(array[mid] < target){
                left = mid + 1;
            } else {
                // otherwise, if the middle element is greater than target, then that means our target will be in the left half of the array because those values will be less than the middle element.
                right = mid - 1;
            }
        }

        // Binary Search in descending order
        // if(array[mid] == target){
        //     found = true;
        //     break;
        // } else if(array[mid] > target){
        //     left = mid + 1;
        // } else {
        //     right = mid - 1;
        // }
    } 
    
}
