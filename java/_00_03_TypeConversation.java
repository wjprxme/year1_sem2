public class _00_03_TypeConversation {
    public static void main(String[] args) {
        String a = Integer.toString(2);
        String b = Double.toString(2.3);
        String c = Boolean.toString(true);

        a = "" + 3;             // String 3
        b = "A" + "Q";          // String AQ

        int x = (int) 2.3 ;     // int 2
        double y = 3;           // ทำได้ เป็น 3.0 อัตโนมัติ
        // String q = (String) 2;  // ทำไม่ได้

        int i = Integer.parseInt("12");
        double j = Double.parseDouble("2.3");
        boolean k = Boolean.parseBoolean("true");
    }
}
