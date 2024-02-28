import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];
        int index = 0;
        while (true) {
            System.out.println("Enter values (-1 to stop)");
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            numbers[index] = num;
            index++;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
