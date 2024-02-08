package ch03;

public class Quiz12 {
    public static void main(String[] args) {
        char ch = 'A';
        boolean b = ('a' <= ch && ch <= 'z') || ('A' <=ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
        System.out.println((int)'A'); //65
        System.out.println((int)'Z'); //90
        System.out.println(b);

    }
}
