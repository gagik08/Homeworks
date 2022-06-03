package javaEssential.hw4.task3;

public class Player implements Playable,Recordable{
    @Override
    public void play() {
        System.out.println("Video is playing...");
    }

    @Override
    public void pause() {
        System.out.println("Video paused...");
    }

    @Override
    public void stop() {
        System.out.println("Video stopped...");
    }

    @Override
    public void record() {
        System.out.println("Video started recording...");
    }
}
