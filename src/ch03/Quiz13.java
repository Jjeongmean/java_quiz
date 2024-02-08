package ch03;

public class Quiz13 {
    public static void main(String[] args) {
        char ch = 'A';
        char lowerCase = ('A' <= ch && ch <= 'Z')?((char)(ch+32)):ch; // ? 대문자➡소문자로, 강제타입 변경
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);

    }
}
