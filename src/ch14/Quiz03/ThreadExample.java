package ch14.Quiz03;

public class ThreadExample {
    public static void main(String[] args) {
        Thread youtubeThread = new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                for(int i=0;i<3;i++) {
                    System.out.println("동영상을 재생합니다.");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw  new RuntimeException(e);
                    }
                }
            }
        });

        Thread musicThread = new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                for(int i=0;i<3;i++) {
                    System.out.println("음악을 재생합니다.");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });

        youtubeThread.start();
        musicThread.start();
    }
}
