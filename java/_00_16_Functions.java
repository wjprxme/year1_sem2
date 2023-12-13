import java.util.Arrays;

public class _00_16_Functions {
    static int a = 8;   // global variable
    
    public static void main(String[] args) {
        int[] x = {3, 4, 2, 5, 0};
        bubbleSort(x);
        System.out.println(Arrays.toString(x));
        System.out.println(f(20));
        System.out.println(a);  // 8
    }

    static void bubbleSort(int[] d) {
        int n = d.length;
        int a = 2;      // local variable
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                if (d[j] > d[j + 1]) {
                    int t = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = t;
                }
            }
        }
        System.out.println(a);  // 2
    }

    static int f(int n) {
        if (n < 2) {
            return n;
        }
        return f(n - 1) + f(n - 2);
    }

    static double prod(double a, double... args) {
        double p = a;
        for (double x : args) {
            p *= x;
        }
        return p;
    }

}