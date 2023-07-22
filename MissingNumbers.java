import java.util.*;

class MissingNumber {
    
    // Function to sort the array using Cycle Sort
    static void sort(int[] arr){
        int i = 0;
        // Continue sorting until either i reaches the end of the array or the value at arr[i] is greater than or equal to the array length.
        while (arr[i] < arr.length && i < arr.length) {
            int correct = arr[i]; // Calculate the correct index where the current element should be placed (adjusted to 0-based)
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

    // Function to find missing numbers in the array and return them as an ArrayList
    static ArrayList<Integer> missingNumber(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
