import java.util.Scanner;

public class _00_10_Array {
    public static void main(String[]args) {
        int n = 10;
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        System.out.println(Arrays.toString(f));

        int[] a = new int[10];
        double[] b = new double[100];
        String[] s = new String[5];
        int[] m = {1, 2, 3, 4, 7};
        String[] t = {"MO", "TU", "WE", "TH", "FR", "SA", "SU"};
        m = new int[] {1, 2, 3}

        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }

        sum = 0;
        for (int e : m) { // for each
            sum += e;
        }

        int[][] x = {{1, 2, 3}, {4, 5, 6}};
        sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                sum += x[i][j];
            }
        }
        sum = 0;
        for (int[] row : x) {
            for (int e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        int[][][] y = {
            {{1, 2}, {2, 3}, {3, 4}},
            {{9, 8}, {5, 6}, {2, 3}}
        };
        System.out.println(Arrays.deepToString(y));

        int[] r = new int[5];
        r[r.length - 1] += 1;
    }
}