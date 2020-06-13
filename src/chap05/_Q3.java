package chap05;

public class _Q3 {

    static int gcd(int x, int y) {
        if(y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    static int gcdArray(int[] a, int start, int num) {
        if(num == 1)
            return a[start];
        else if(num == 2)
            return gcd(a[start], a[start + 1]);
        else
            return gcdArray(a, start + 1, num - 1);
    }

    public static void main(String[] args) {
        int[] a = {22, 8, 220, 20, 30, 34, 55};
        System.out.println(gcdArray(a, 0, a.length));
    }

}
