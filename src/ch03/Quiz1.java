package ch03;

public class Quiz1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--); // 11+20 = 31
        System.out.println(z);

        /*
        (++x) + (y--); // 11+20=31
        ++x: x를 먼저 1증가한 후에 대입 ➡ 11
        y--: y를 먼저 대입하고 1 감소 ➡ 20
         */
    }
}
