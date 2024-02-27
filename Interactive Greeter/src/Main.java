//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name?:");//Ask name
    String name = sc.nextLine();
    System.out.println("Where are you from?:");//ask place
    String place = sc.nextLine();
        System.out.println("How old are you");//ask age
        int age = sc.nextInt();
        System.out.println("Hello,"+ name+ " from " + place+ " You are "+age+" old.");
        System.out.println("What is something you like to do?:");//ask activity
        sc.nextLine();
        String activity = sc.nextLine();
        System.out.println("have fun next time you do "+activity+"!");
        System.out.println("How much would you like to donate today?");
        int donate = sc.nextInt();
        System.out.println("You will donate $"+donate+" today. Yay!");


    }
}