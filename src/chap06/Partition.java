package chap06;

import java.util.logging.Level;

public class Partition {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void partition(int[] a, int n) {
        int pl = 0;
        int pr = n - 1;
        int x = a[n / 2];

        do {
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr)
                swap(a, pl++, pr--);
        } while(pl <= pr);

        System.out.print("이하 그룹 : ");
        for(int i = 0; i <= pl - 1; i++)
            System.out.print(a[i] + " ");

        System.out.println();

        if(pl > pr + 1) {
            System.out.print("피벗과 일치하는 그룹 : ");
            for(int i = pr + 1; i <= pl - 1; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }

        System.out.print("이상 그룹 : ");
        for(int i = pr + 1; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        int[] a = {84, 4, 11, 3, 56, 8, 102};

        partition(a, a.length);

    }

}
