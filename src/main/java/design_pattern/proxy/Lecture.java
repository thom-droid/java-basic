package design_pattern.proxy;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lecture {

    private String name;
    private int id;
    private LocalTime time;

    public List<Student> getStudents() {
        return students;
    }

    private final List<Student> students = new ArrayList<>();

    public Lecture(String name, int id, LocalTime time) {
        this.name = name;
        this.id = id;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecture lecture = (Lecture) o;
        return id == lecture.id && name.equals(lecture.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public boolean checkIfPresent(Student student) {
        return this.getStudents().stream()
                .filter(student1 -> Objects.equals(student1, student))
                .findFirst()
                .orElseThrow(() ->
                        new RuntimeException("this student is not taking this lecture"))
                .isAttending(this);
    }
}
