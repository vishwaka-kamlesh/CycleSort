import java.util.*;

class MissingNumber {
    
    // Function to sort the array using Cycle Sort
    static void sort(int[] arr){
        
       int i = 0;
       // Continue sorting until either i reaches the end of the array or the value at arr[i] is greater than or equal to the array length.
       while (arr[i] < arr.length && i < arr.length) {
            int correct = arr[i]; // The correct index where the current element should be placed
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct); // If the current element is not in its correct position, swap it with the element at the correct position
            } else {
                i++; // If the current element is in its correct position, move on to the next element
            }
        }
    }
    
    // Function to swap two elements in an array
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    // Function to find the missing number in the sorted array
    static int missingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) { // If the value at index i is not equal to i, then i is the missing number
                return i;
            }
        }
        return arr.length - 1; // If no missing number is found, return the last index (assumes the last element is missing)
    }
    
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 1 };
        sort(arr); // Sort the array using Cycle Sort
        System.out.println(missingNumber(arr)); // Print the missing number in the sorted array
    }
}
