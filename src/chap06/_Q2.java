package chap06;

public class _Q2 {

    static void bubbleSort(int[] a, int n) {

        for(int i = 0; i < n - 1; i++) { // n - 1회
            System.out.println("패스" + i + ":");
            for(int j = n - 1; j > i; j--) {
                if(a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    for(int k = 0; k < n; k++) {
                        System.out.print(a[k] + " ");
                    }
                } else {
                    for(int k = 0; k < n; k++) {
                        System.out.print(a[k] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 4, 3, 1, 5, 2, 0, 9, 8};

        bubbleSort(arr, arr.length);

    }

}
