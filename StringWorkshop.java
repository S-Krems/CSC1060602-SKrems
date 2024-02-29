import java.util.Scanner;
public class StringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a starting string: ");
        String inputString = scanner.nextLine();
        // While true is always true making it an infinite loop to continue asking
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add more content to the string");
            System.out.println("2. Check if a string contains a substring");
            System.out.println("3. Output the length of the string");
            System.out.println("4. Output the substring after a given prefix");
            System.out.println("5. Output the substring before a given suffix");
            System.out.println("6. Output the substring before and after a given prefix and suffix");
            System.out.println("7. Exit the program");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt(); //reads choice from user
            scanner.nextLine(); // Consume newline created

            switch (choice) {
                case 1:
                    System.out.print("Enter content to add: ");
                    String contentToAdd = scanner.nextLine();
                    inputString += contentToAdd; // X += y is the same as X =X+ Y
                    System.out.println("Updated string: " + inputString);
                    break;
                case 2:
                    System.out.print("Enter substring to check: ");
                    String substring = scanner.nextLine();
                    boolean containsSubstring = inputString.contains(substring);
                    System.out.println("String contains substring: " + containsSubstring);
                    break;
                case 3:
                    System.out.println("Length of the string: " + inputString.length());
                    break;
                case 4:
                    System.out.print("Enter prefix: ");
                    String prefix = scanner.nextLine();
                    int prefixIndex = inputString.indexOf(prefix);
                    if (prefixIndex != -1) {
                        String substringAfterPrefix = inputString.substring(prefixIndex + prefix.length());
                        System.out.println("Substring after prefix: " + substringAfterPrefix);
                    } else {
                        System.out.println("Prefix not found in the string.");
                    }
                    break;
                case 5:
                    System.out.print("Enter suffix: ");
                    String suffix = scanner.nextLine();
                    int suffixIndex = inputString.indexOf(suffix);
                    if (suffixIndex != -1) {
                        String substringBeforeSuffix = inputString.substring(0, suffixIndex);
                        System.out.println("Substring before suffix: " + substringBeforeSuffix);
                    } else {
                        System.out.println("Suffix not found in the string.");
                    }
                    break;
                case 6:
                    System.out.print("Enter prefix: ");
                    String customPrefix = scanner.nextLine();
                    System.out.print("Enter suffix: ");
                    String customSuffix = scanner.nextLine();
                    int start = inputString.indexOf(customPrefix) + customPrefix.length();
                    int end = inputString.indexOf(customSuffix);
                    if (start != -1 && end != -1) {
                        String substringBetweenPrefixAndSuffix = inputString.substring(start, end);
                        System.out.println("Substring between prefix and suffix: " + substringBetweenPrefixAndSuffix);
                    } else {
                        System.out.println("Prefix or suffix not found in the string.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}
