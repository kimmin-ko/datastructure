package chap05;

import chap04.IntStack;

public class RecurX2 {

    static void recur(int n) {
        IntStack s = new IntStack(n);

        while(true) {
            if(n > 0) {
                s.push(n);
                n -= 1;
                continue;
            }
            if(s.isEmpty() != true) {
                n = s.pop(); // n = 1, s = [4 3 2 1]
                System.out.println(n);
                n -= 2;
                continue;
            }
            break;
        }

    }

    public static void main(String[] args) {

    }

}
