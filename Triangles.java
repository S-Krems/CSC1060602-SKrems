import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Get valid size input
            int size;
            do {
                System.out.print("Enter the size of the triangle (1-50): ");
                size = scanner.nextInt();
            } while (size <= 0 || size > 50);

            // Get fill character input
            System.out.print("Enter the character to use for drawing the triangle: ");
            char fillCharacter = scanner.next().charAt(0);

            // Draw the triangle
            for (int i = 0; i < size; i++) {
                System.out.printf("%" + (size - i) + "s", ""); // Print spaces
                for (int j = 0; j <= i; j++) {
                    System.out.print(fillCharacter + " "); // Print fill characters
                }
                System.out.println(); // Move to the next line
            }

            // Ask to run again
            System.out.print("Do you want to run the program again? (y/n): ");
        } while (scanner.next().equalsIgnoreCase("y"));

        //end
        System.out.println("Goodbye!");
    }
}
