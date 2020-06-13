package chap05;

public class _Q4 {

    static void recur(int n) {
        if(n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }
    // 상향식 분석
    /** recur(4) [1 2 3 1 4 1 2]
     *      recur(3) [1 2 3 1]
     *          recur(2) [1 2]
     *              recur(1) [1]
     *                  recur(0) x
     *                  1
     *                  recur(-1) x
     *              2
     *              recur(0) x
     *          3
     *          recur(1)
     *      4
     *      recur(2) [1 2]
     */

}
