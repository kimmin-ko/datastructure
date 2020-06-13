package chap05;

public class _Q1 {

    public static void main(String[] args) {
        int sum = 1;
        int n = 12;

        while(n > 0)
            sum *= n--;

        System.out.println(sum);
    }

}
