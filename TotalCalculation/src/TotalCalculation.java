import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TotalCalculation {
    public static void main(String[] args) {
        //Input and output file paths
        String inputFile = "items.txt";
        String outputFile = "total.txt";

        //Read input file and calculate total
        try (Scanner scanner = new Scanner(new File(inputFile))) {
            double total = 0.0;
            while (scanner.hasNextDouble()) {
                total += scanner.nextDouble();
            }

            // Calculate sales tax at 5.3%
            double taxRate = 0.053;
            double salesTax = total * taxRate;

            //Calculate final total
            double finalTotal = total + salesTax;

            //Write results to output file
            try (PrintWriter writer = new PrintWriter(new File(outputFile))) {
                // Write subtotal, sales tax, and final total with two decimal points
                writer.printf("The sub-total is: $%.2f\n", total);
                writer.printf("The tax is: $%.2f\n", salesTax);
                writer.printf("The total is: $%.2f\n", finalTotal);
            } catch (FileNotFoundException e) {
                System.out.println("output file not found: " + outputFile);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
        }
    }
}