package chap05;

public class _Q2 {

    public static void main(String[] args) {
        int x = 22;
        int y = 8;

        while(y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println(x);
    }

}
