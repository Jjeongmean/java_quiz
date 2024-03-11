package ch14.Quiz04;

public class Main {
    public static void main(String[] args) {
        MusicThread musicThread = new MusicThread();
        musicThread.start();


        YoutubeThread youtubeThread = new YoutubeThread();
        youtubeThread.start();

    }
}
