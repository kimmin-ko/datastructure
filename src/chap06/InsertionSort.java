package chap06;

public class InsertionSort {

    static void insertionSort(int[] a, int n) {
        for(int i = 1; i < n; i++) {
            int j;
            int temp = a[i];
            for(j = i; j > 0 && a[j-1] > temp; j--) {
                a[j] = a[j-1];
            }
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] x = {5,4,6,3,7,8,2,1,9,0};

        insertionSort(x, x.length);

        for(int a : x) {
            System.out.print(a + " ");
        }
    }
    
}
