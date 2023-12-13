import java.util.Scanner;

public class _00_07_Selectionifelse {
    public static void main(String[]args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("m = ");
        int m = kb.nextInt();
        System.out.print("y = ");
        int y = kb.nextInt();
        int d = 31;
        if (m == 2) {
            d = 28;
            if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
                d = 29;
            }
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11) {
            d = 30;
        }
        System.out.println(d);
    }
}