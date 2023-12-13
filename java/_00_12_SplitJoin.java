import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArraysList;

public class _00_12_SplitJoin {
    public static void main(String[]args) {
        String s = "A BB CCCC";
        String[] t = s.split(" ");
        List <String> t1 = Arrays.asList(t);
        System.out.println(t1);
        String u = String.join(", ", t1);
        System.out.println(u);

        Scanner kb = new Scanner(System.in);
        System.out.print(">>");
        String s = kb.nextLine();
        List <String> t = Arrays.asList(s.split(" "));
        List <String> u = new ArrayList <>();
        for (String w : t) {
            if (!u.contains(w)) {
                u.add(w);
            }
        }
        System.out.println(String.join(", ", u));
    }
}