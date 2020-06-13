package chap05;

public class Factorial {

    // 1. 0! = 1
    // 2. n > 0이면 n! = n * (n - 1)!

    // 자기 자신과 똑같은 메서드가 필요하다.
    static int factorial(int n) {
        System.out.println("n ==> " + n);
        if(n > 0)
            return n * factorial(n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(factorial(12));
    }

}