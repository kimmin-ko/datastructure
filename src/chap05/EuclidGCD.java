package chap05;

public class EuclidGCD {

    static int gcd(int x, int y) {
        if(y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    public static void main(String[] args) {
        System.out.println(gcd(22, 8));

        // gcd(22, 8)
        // gcd(8, 6)
        // gcd(6, 2)
        // gcd(2, 0) => 2
    }
}
