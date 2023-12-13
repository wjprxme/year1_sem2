import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class _00_11_List {
    public static void main(String[]args) {
        int[] q = new int[3];
        List <Integer> a = new ArrayList <Integer> ();
        List <Integer> l = new LinkedList <Integer> ();

        for (int i = 0; i < 5; i++) {
            a.add(i);                   // push_back(x)
        }
        System.out.println(a);
        a.add(0, 999);                  // insert(pos, x)
        System.out.println(a);
        a.set(2, 2222);                 // เปลี่ยนแปลงค่า
        a.set(3, a.get(3) + 10000);     // เพิ่มค่า
        System.out.println(a);
        a.remove(1);                    // erase(pos)
        System.out.println(a);       
        
        List <Integer> b = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(b);
        a.addAll(b);
        System.out.println(a);
        a.addAll(0, b);
        System.out.println(a);

        for (int x : a) {
            System.out.print(x+", ");
        }
    }
}