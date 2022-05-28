package javaEssential.hw3.task2;

public class Main {
    public static void main(String[] args) {
        ClassRoom roomWith1Pupil = new ClassRoom(new GoodPupil());
        ClassRoom roomWith2Pupils = new ClassRoom(new GoodPupil(), new ExcelentPupil());
        ClassRoom roomWith3Pupils = new ClassRoom(new GoodPupil(), new BadPupil(), new ExcelentPupil());
        ClassRoom roomWith4Pupils = new ClassRoom(new GoodPupil(), new BadPupil(), new ExcelentPupil(), new ExcelentPupil());
        System.out.println("Classroom #1");
        roomWith1Pupil.classroomInfo();
        System.out.println("\nClassroom #2");
        roomWith2Pupils.classroomInfo();
        System.out.println("\nClassroom #3");
        roomWith3Pupils.classroomInfo();
        System.out.println("\nClassroom #4");
        roomWith4Pupils.classroomInfo();
    }
}
