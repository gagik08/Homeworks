package javaEssential.hw3.task2;

public class GoodPupil extends Pupil{
    @Override
    public void write() {
        System.out.println("I am a 'Good Pupil'and Evaluating on a 10 point scale, I can write at 8 points");
    }

    @Override
    public void read() {
        System.out.println("I am a 'Good Pupil'and Evaluating on a 10 point scale, I can read at 8 points");
    }

    @Override
    public void relax() {
        System.out.println("I am a 'Good Pupil'and I relax 5 hours a day");
    }

    @Override
    public void study() {
        System.out.println("I am a 'Good Pupil'and I have a good academic performance");
    }
}
