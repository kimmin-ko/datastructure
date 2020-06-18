package chap06;

public class BubbleSort {

    static void bubbleSort(int[] a, int n) {

        for(int i = 0; i < n - 1; i++) { // n - 1회
            for(int j = n - 1; j > i; j--) {
                if(a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
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
