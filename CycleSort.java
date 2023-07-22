import java.util.*;

class CycleSort {
    
    // Function to sort an array using Cycle Sort
    static void sort(int[] arr){
        
        int i = 0;
        while (i < arr.length) {
            // The correct index where the current element should be placed is (arr[i] - 1)
            int correct = arr[i] - 1;
            
            // If the element is not already in its correct position
            if (arr[i] != arr[correct])
                // Swap the current element with the element at the correct position
                swap(arr, i, correct);
            else
                // If the current element is already in its correct position, move to the next element
                i++;
        }
    }
    
    // Function to swap two elements in an array
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public static void main(String[] args) {
        // Example array to be sorted
        int[] arr = { 3, 4, 5, 2, 1 };
        
        // Sort the array using Cycle Sort
        sort(arr);
        
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
