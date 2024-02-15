import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sizeOfArray = arr.length;

        System.out.println("Initial Array: " + Arrays.toString(arr));

        // Insert element at index 2
        int indexToInsert = 2;
        int elementToInsert = 10;
        insert(arr, sizeOfArray, indexToInsert, elementToInsert);
        System.out.println("Array after inserting " + elementToInsert + " at index " + indexToInsert + ": " + Arrays.toString(arr));

        // Delete element at index 4
        int indexToDelete = 4;
        delete(arr, sizeOfArray, indexToDelete);
        System.out.println("Array after deleting element at index " + indexToDelete + ": " + Arrays.toString(arr));

        // Search for element 3
        int elementToSearch = 3;
        int searchResult = search(arr, sizeOfArray, elementToSearch);
        if (searchResult != -1) {
            System.out.println("Element " + elementToSearch + " found at index " + searchResult);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the array");
        }
    }

    // Inserts element at given index
    static void insert(int arr[], int sizeOfArray, int index, int element) {
        // Check if index is out of bounds
        if (index > sizeOfArray) {
            System.out.println("Index is out of bounds");
            return;
        }

        // Move elements one position ahead from index
        for (int i = sizeOfArray - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert element at index
        arr[index] = element;
        
    }

    // Deletes element from given index
    static void delete(int arr[], int sizeOfArray, int index) {
        // Check index is valid
        if (index >= sizeOfArray) {
            System.out.println("Invalid index");
            return;
        }

        // Shift elements left after index
        for (int i = index; i < sizeOfArray - 1; i++) {
            arr[i] = arr[i + 1];
            
        }

        // Set the last element to 0 or any default value
        arr[sizeOfArray - 1] = 0;
    }

    // Linear search
    static int search(int arr[], int sizeOfArray, int element) {
        // Traverse array
        for (int i = 0; i < sizeOfArray; i++) {
            // Check element found
            if (arr[i] == element) {
                return i;
            }
        }

        // If not found
        return -1;
    }
}