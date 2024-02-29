//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numeric grade: ");
        int grade = sc.nextInt();
        if (grade > 92) {
            System.out.println("Your grade is: A");
        } else if (grade <92  && grade >= 89) {
            System.out.println("your grade is A-");
        } else if (grade >= 87 && grade <= 89) {
            System.out.println("your grade is B+");
        } else if (grade >= 82 && grade <= 87) {
            System.out.println("Your grade is: B");
        } else if (grade >= 79 && grade <= 82) {
            System.out.println("your grade is B-");
        } else if (grade >= 77 && grade <= 79) {
            System.out.println("your grade is C+");
        } else if (grade >= 72 && grade <= 77) {
            System.out.println("Your grade is: C");
        } else if (grade >= 69 && grade <= 72) {
            System.out.println("your grade is C-");
        } else if (grade >= 67 && grade <= 69) {
            System.out.println("your grade is D+");
        } else if (grade >= 60 && grade <= 67) {
            System.out.println("your grade is D");
        } else {
            System.out.println("your grade is F");
        }
    }}