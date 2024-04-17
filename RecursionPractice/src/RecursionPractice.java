import java.util.Scanner;
// Uncomment below import if needed
// import java.util.List;
// import java.util.ArrayList;

public class RecursionPractice {
    // Iterative Append
    public static String appendNTimes(String string, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(string);
        }
        return result.toString();
    }

    // Iterative function to find the largest power of 2 greater than n
    public static int powerOf2GreaterThanN(int n) {
        int power = 1;
        while (power <= n) {
            power *= 2;
        }
        return power;
    }

    // Iterative Contains function - Array version
    public static int contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i + 1; // Adjusting index to 1-based for user interface
            }
        }
        return -1;
    }

    // Iterative Contains function - List version
    /* Uncomment below for list version
    public static int contains(List<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                return i + 1; // Adjusting index to 1-based for user interface
            }
        }
        return -1;
    }
    */

    // Recursive Contains function
    public static int containsRecursive(int[] arr, int num, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == num) {
            return index + 1; // Adjusting index to 1-based for user interface
        }
        return containsRecursive(arr, num, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Iterative Append
        System.out.println("Iterative Append");
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the number of times to append: ");
        int n = scanner.nextInt();
        System.out.println("Result: " + appendNTimes(inputString, n));

        // Largest power of 2 more than N
        System.out.println("\nLargest power of 2 more than N");
        System.out.print("Enter an integer: ");
        int integerInput = scanner.nextInt();
        System.out.println("Result: " + powerOf2GreaterThanN(integerInput));

        // Contains - Array version
        System.out.println("\nContains - Array version");
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter a number to search: ");
        int searchNum = scanner.nextInt();
        int index = contains(arr, searchNum);
        if (index != -1) {
            System.out.println("Result: " + index);
        } else {
            System.out.println("Result: Value not found.");
        }

        /* Double-commented loop
        // Recursive Contains function
        System.out.println("\nRecursive Contains - Array version");
        System.out.print("Enter a number to search recursively: ");
        int searchNumRecursive = scanner.nextInt();
        int indexRecursive = containsRecursive(arr, searchNumRecursive, 0);
        if (indexRecursive != -1) {
            System.out.println("Result: " + indexRecursive);
        } else {
            System.out.println("Result: Value not found.");
        }
        */
    }
}
