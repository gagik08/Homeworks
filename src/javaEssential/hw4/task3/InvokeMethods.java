package javaEssential.hw4.task3;

public class InvokeMethods {
    public static void main(String[] args) {
        Playable playable = new Player();
        Recordable recordable = new Player();

        playable.play();
        playable.stop();
        playable.play();
        System.out.println();
        recordable.record();
        recordable.pause();
        recordable.stop();

        }
    }
