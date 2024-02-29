
import java.util.Scanner;
public class BottlesOfBeer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number of bottles: ");
        int numBottles = sc.nextInt();
        sc.nextLine();

        for (int i = numBottles; i > 0; i--) {
            if (i == 1) {
                System.out.println("1 bottle of beer on the wall,");
                System.out.println("1 bottle of beer,");
                System.out.println("Take one down, pass it around,");
                System.out.println("No more bottles of beer on the wall.\n");
            } else {
                System.out.println(i + " bottles of beer on the wall,");
                System.out.println(i + " bottles of beer,");
                System.out.println("Take one down, pass it around,");
                System.out.println((i - 1) + (i - 1 == 1 ? " bottle" : " bottles") + " of beer on the wall.\n");
            }
        }

        System.out.println("Go to the store and buy some more lol,");
        System.out.println(numBottles + " bottles of beer on the wall.");
    }
}


