package chap06;

public class ShellSort {

    static void shellSort(int[] a, int n) {
        for(int h = n / 2; h > 0; h /= 2) {
            for(int i = h; i < n; i++) {
                int j;
                int temp = a[i];
                for(j = i - h; j >= 0 && a[j] > temp; j-=h)
                    a[j + h] = a[j];
                a[j + h] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {84, 4, 11, 3, 56, 8, 102};

        shellSort(a, a.length);

        for(int x : a) {
            System.out.print(x + " ");
        }
    }

}
