import java.util.Scanner;

public class _00_06_CelsiustoFahrenheit {
    public static void main(String[]args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("c = ");
        double c = kb.nextDouble();
        double f = 9.0/5*c + 32;
        System.out.println("f = " + f);
    }
}