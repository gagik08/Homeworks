package javaEssential.hw3.task2;

public class ClassRoom {
    Pupil[] pupils;
    public ClassRoom(Pupil p1, Pupil p2, Pupil p3, Pupil p4) {
        pupils = new Pupil[]{ p1, p2, p3, p4 };
    }
    public ClassRoom(Pupil p1, Pupil p2, Pupil p3) {
        pupils = new Pupil[]{ p1, p2, p3 };
    }
    public ClassRoom(Pupil p1, Pupil p2) {
        pupils = new Pupil[]{ p1, p2 };
    }
    public ClassRoom(Pupil p1) {
        pupils = new Pupil[]{ p1 };
    }

    public void classroomInfo() {
        for (Pupil p : pupils) {
            p.study();
            p.read();
            p.write();
            p.relax();
        }
    }
}
