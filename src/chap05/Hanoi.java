package chap05;

public class Hanoi {

    // no : 원반 개수, x : 시작 기둥, y : 목표 기둥
    static void move(int no, int x, int y) {
        if(no > 1)
            move(no - 1, x, 6 - x - y);

        System.out.println(no + " " + x + " " + y);

        if(no > 1)
            move(no - 1, 6 - x - y, y);

    }

    public static void main(String[] args) {
        move(3, 1, 3);
    }

    /** 상향식
     *  move(3, 1 ,3) - main call
     *
     *      move(2, 1, 2) -> 맨 아래 제외 원반 시작에서 중간으로
     *          move(1, 1, 3)
     *              print(1, 1, 3) -> 맨 위 원반을 1에서 3으로
     *          print(2, 1, 2) -> 두 번째 원반을 1에서 2로
     *          move(1, 3, 2) -> 맨 위 원반을 3에서 2로
     *
     *      print(3 - 1 - 3)
     *
     *      move(2, 2, 3) -> 맨 아래 제외 원반 중간에서 목표로
     */

}