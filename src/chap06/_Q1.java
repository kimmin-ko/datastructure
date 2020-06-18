package chap06;

public class _Q1 {

    static void bubbleSort(int[] a, int n) {
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 6, 4, 3, 4, 5, 7, 3, 4, 5, 3, 11, 2, 3, 55, 3, 5}; // 17

        bubbleSort(arr, arr.length);

        for(int i : arr) {
            System.out.print(i + " ");
        }

    }

}
