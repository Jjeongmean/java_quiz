package ch14.Quiz02;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                //멀티스레드로 동시 실행시키고 싶은 코드를 run() 메소드에 출력
                for (int i = 0; i <5 ; i++) {
                    System.out.println("글 작성 중");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread1.start(); // 스레드 실행

        for (int i = 0; i < 5 ; i++) {
            System.out.println("음악 듣는중");
        }
    }
}

