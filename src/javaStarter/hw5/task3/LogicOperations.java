package javaStarter.hw5.task3;

public class LogicOperations {
    public static void main(String[] args) {
        int x = 5;  // 101
        int y = 10; // 1010
        int z = 15; // 1111

        x += y >> x++ * z;
        //  1) y >> (x++ * z)
        //  2) x++ * z = 5 * 15 = 75
        //  3) y >> 90 = 1010 >> 75 = 0
        //  4) x += 0 -> 5 + 0 = 5
        System.out.println(x);

        z = ++x & y * 5;
        // 1) ++x & (y * 5)
        // 2) y * 5 = 10 * 5 = 50
        // 3) ++x & 50 = 110 & 110010 = 10 ( binary ) = 2
        System.out.println(z);

        y /= x + 5 | z;
        // 1) x + (5 | z)
        // 2) 5 | z = 101 | 1111 = 1111 (binary) = 15
        // 3) x + 15 = 5 + 15 = 20;
        // 4) y /= 20  = 10 / 20 = 0.5 = 0 (int)
        System.out.println(y);

        z = x++ & y * 5;
        // 1) x++ & (y * 5)
        // 2) y * 5 = 10 * 5 = 50
        // 3) x++ & 50 = 101 & 00110010 = 0 (binary) = 0
        System.out.println(z);

        x = y << x++ ^ z;
        // 1) (y << x++) ^ z;
        // 2) y << x++ = 10 << 5 = 1010 << 5 = 101000000 (bin) = 320
        // 3) 320 ^ 15 = 101000000 ^ 1111 = 101001111 (bin) = 335
        System.out.println(x);

    }
}
