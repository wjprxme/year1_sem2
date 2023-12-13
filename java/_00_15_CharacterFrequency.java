import java.util.Scanner;

public class _00_15_CharacterFrequency {
    public static void main(String[] args) {
        // System.out.print(">>");
        // Scanner kb = new Scanner(System.in);
        // String t = kb.nextLine();
        // Map <Character, Integer> wc = new HashMap<>();
        // for (Character c : t.toCharArray()) {
        //     if (wc.containsKey(c)) {
        //         wc.put(c, wc.get(c) + 1);
        //     }
        //     else {
        //         wc.put(c, 1);
        //     }
        // }
        // System.out.println(wc);
        // Set <Character> keySet = wc.keySet();
        // List <Character> keyList = new ArrayList<> (keySet);
        // Collections.sort(keyList);
        // for (Character c : keyList) {
        //     System.out.println(c + " -> " + wc.get(c));
        // }

        System.out.print(">>");
        Scanner kb = new Scanner(System.in);
        String t = kb.nextLine();
        int[] wc = new int[26];
        t = t.toUpperCase();
        for (char c : t.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                if ('A' <= c && c <= 'Z') {
                    wc[c - 'A']++;
                }
            }
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            if (wc[c - 'A'] != 0) {
                System.out.println(c + " --> " + wc[c - 'A']);
            }
        }
    }
}