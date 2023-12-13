import java.util.Scanner;

public class _00_08_Repetitionwhilefor {
    public static void main(String[]args) {
        int n = 2000;
        int b = 0;
        while (n > 0) {
            b++;
            n /= 2;
        }
        System.out.println(b);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i); // 0 - 9
            i++;
        }
        System.out.println(i); // 10 
    }
}