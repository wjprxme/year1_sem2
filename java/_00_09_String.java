import java.util.Scanner;

public class _00_09_String {
    public static void main(String[]args) {
        String s = "I'm a \"string\"";
        char c = 'x';
        String t = s + s;
        t = s + 2 + 3;

        int k = s.length();
        t = s.trim();           // ลบช่องว่างซ้ายขวา
        t = s.toUpperCase();
        t = s.toLowerCase();
        k = s.indexOf("OK");    // find
        k = s.indexOf("OK", 10);
        if (s.contains("OK")) {

        }
        if (s.indexOf("OK") >= 0) {

        }

        String a = "OK";
        String b = "ok".toUpperCase();
        String c = "O" + "K";

        System.out.println(a == "OK");      // true
        System.out.println(a == b);         // false
        System.out.println(a == c);         // true
        
        System.out.println(a.equals("OK")); // true
        System.out.println(a.equals(b));    // true
        System.out.println(a.equals(c));    // true
        
        if (a.compareTo(b) == 0) {
            // a == b
        }
        if (a.compareTo(b) < 0) {
            // a < b
        }
        if (a.compareTo(b) > 0) {
            // a > b
        }

        String d = "abcde";
        for (char c : d.toCharArray()) {
            if ('a' < c && c < 'e') {
                System.out.print(c);    // bcd
            }
        }
        System.out.println();

        String e = "abcdefghijk";
        String f;
        f = e.substring(2,3);           // c
        f = e.substring(2,8);           // cdefgh
        f = e.substring(0,8);           // abcdefgh
        f = e.substring(2);             // cdefghijk
        f = e.substring(e.length() - 1);// k
        char g = e.charAt(4);           // e

        Scanner kb = new Scanner(System.in);
        System.out.print(">>");
        String t = kb.nextLine();
        int count = 0;
        for (char c : t.toUpperCase().toCharArray()) {
            if ("AEIOU".indexOf(c) >= 0) {
                count++;
            }
        }
        System.out.println("#vowels = " + count);
    }
}