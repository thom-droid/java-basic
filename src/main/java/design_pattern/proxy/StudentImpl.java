package design_pattern.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentImpl implements Student {

    private int id;
    private String name;

    private final List<Attendance> attendances = new ArrayList<>();
    private final List<Lecture> lectures = new ArrayList<>();

    public StudentImpl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public List<Attendance> getAttendances() {
        return this.attendances;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public void attend(Lecture lecture) {
        System.out.println("attending the lecture...");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void drop() {

    }

    @Override
    public void register(Lecture lecture) {
        if (!lectures.contains(lecture)) {
            this.lectures.add(lecture);
        }
        if (!lecture.getStudents().contains(this)) {
            lecture.getStudents().add(this);
        }
        Attendance attendance = new Attendance(this, lecture);
        this.getAttendances().add(attendance);
    }

    public boolean isAttending(Lecture lecture) {
        return getAttendances().stream()
                .filter( attendance -> Objects.equals(attendance.getLecture(), lecture))
                .findFirst().orElseThrow()
                .isPresent();
    }
}
