//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Fahrenheit temperature");
        float Fahrenheit = sc.nextFloat();
        float Celsius = (float) ((Fahrenheit-32)*(0.555555555556));
        float Kelvin = (float) (Celsius + 273.15);
        System.out.println("The temperature in Celsius is:" + Celsius +"°" + "The Temperature in Kelvin is:" + Kelvin + "°");

    }
}