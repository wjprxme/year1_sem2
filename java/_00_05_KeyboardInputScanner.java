import java.util.Scanner;

public class _00_05_KeyboardInputScanner {
    public static void main(String[]args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        double b = kb.nextDouble();
        String c = kb.next();       // อ่านจนเว้นวรรค / เว้นบรรทัด
        String d = kb.nextLine();   // อ่านจนหมดบรรทัด

        System.out.println(a+", "+b+", "+c);
    }
}