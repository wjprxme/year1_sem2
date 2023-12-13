public class _00_04_Operators {
    public static void main(String[] args) {
        int a = 3;
        int b, c, d;
        b = (c = 1 + (d = 0)) + 2;  // ทำได้ แต่ไม่ควรทำ
        
        int x = 2;
        int y = 3;
        int t = x;
        x = y;
        y = t;

        int q = 1+2*3-4/5;   // 7 (1 + 6 - 0)
        int e = (int) 1.0 + 3;
        double f = Math.pow(2, 10);

        System.out.println(5 % 3);      // 2
        System.out.println(-5 % 3);     // -2
        System.out.println(5 % -3);     // 2
        System.out.println(-5 % -3);    // -2

        int w = 9;
        w += 2;     // w ต้องการมีค่าเริ่มต้นก่อน
        w += 1;
        w++;
        w = 8;
        int r = ++w // r = 9;
        r = w++     // r = 8;
        w--;
        --w;

        double z = Math.sqrt(3);    // ไม่ต้อง import / ต้องเก็บใน double
        z = Math.PI + Math.E;
        z = Math.max(z, 10);

        
    }
}