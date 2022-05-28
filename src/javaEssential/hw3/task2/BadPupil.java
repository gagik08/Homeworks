package javaEssential.hw3.task2;

public class BadPupil extends Pupil{
    @Override
    public void write() {
        System.out.println("I am a 'Bad Pupil'and Evaluating on a 10 point scale, I can write at 4 points");
    }

    @Override
    public void read() {
        System.out.println("I am a 'Bad Pupil'and Evaluating on a 10 point scale, I can read at 4 points");
    }

    @Override
    public void relax() {
        System.out.println("I am a 'Bad Pupil'and I relax 8 hours a day");
    }

    @Override
    public void study() {
        System.out.println("I am a 'Bad Pupil'and I have a poor academic performance");
    }
}
