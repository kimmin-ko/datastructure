package chap06;

public class ShellSort2 {

    static void shellSort(int[] a, int n) {
        int h;
        for(h = 1; h < n / 9; h = h * 3 + 1)
            ;

        // h = 4
        // i = 4
        for(int i = h; i < n; i++) {
            int j;
            int temp = a[i];
            // 0
            for(j = i - h; j >= 0 && a[j] > temp; j -= h)
                a[j + h] = a[j];
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {84, 4, 11, 3, 56, 8, 102};

        shellSort(a, a.length);

        for(int x : a)
            System.out.print(x + " ");
    }

}
