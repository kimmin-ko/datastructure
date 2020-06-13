package chap05;

public class _Q5 {

    static void recur(int n) {

    }

    public static void main(String[] args) {
        recur(4);
    }

    /**
     *  recur(4) [1 2 1 3 1 2 4]
     *      recur(3) [1 2 1 3]
     *          recur(2) [1 2]
     *              recur(1) [1]
     *                  recur(0) x
     *                  recur(-1) x
     *                  1
     *              recur(0) x
     *              pop 2
     *          recur(1) [1]
     *          3
     *      recur(2) [1 2]
     *      4
     */

}
