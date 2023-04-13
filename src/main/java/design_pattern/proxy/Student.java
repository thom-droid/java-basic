package design_pattern.proxy;

import java.util.List;

public interface Student {

    void attend(Lecture lecture);
    void drop();

    List<Attendance> getAttendances();

    String getName();

    void register(Lecture lecture);

    boolean isAttending(Lecture lecture);

}
