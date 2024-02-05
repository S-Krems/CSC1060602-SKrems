//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter radius:");
int Radius = sc.nextInt();
double Diameter = (2 * Radius);
double Area = PI*Radius*Radius;
double Circumference = 2 * PI * Radius;
System.out.println("Diameter is: "+Diameter+" Area is: "+Area+" Circumference is: "+Circumference);
    }
}