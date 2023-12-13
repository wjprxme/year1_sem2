import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class _00_13_Set {
    public static void main(String[]args) {
        Set <Integer> s = new HashSet<>();        
        for (int i = 0; i < 6; i++) {
            s.add(i);
        }
        s.remove(3);
        System.out.println(s);             
        if (s.contains(4)) {
            System.out.println("4444");
        }
        for (int x : s) {
            System.out.println(x);
        }

        Set <Integer> s = new TreeSet<>();  // เรียงจากน้อยไปมาก
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s);
    }
}