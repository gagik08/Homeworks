package javaEssential.hw3.task2;

public class ExcelentPupil extends Pupil{
    @Override
    public void write() {
        System.out.println("I am an 'Excelent Pupil'and Evaluating on a 10 point scale, I can write at 10 points");
    }

    @Override
    public void read() {
        System.out.println("I am an 'Excelent Pupil'and Evaluating on a 10 point scale, I can read at 10 points");
    }

    @Override
    public void relax() {
        System.out.println("I am an 'Excelent Pupil'and I relax 2 hours a day");
    }

    @Override
    public void study() {
        System.out.println("I am an 'Excelent Pupil'and I have an excellent academic performance");
    }
}
