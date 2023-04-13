package design_pattern.proxy;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalTime;

@Getter
@EqualsAndHashCode
public class Attendance {

    private boolean isPresent;
    private LocalTime time;

    private final Student student;
    private final Lecture lecture;

    public Attendance(Student student, Lecture lecture) {
        this.student = student;
        this.lecture = lecture;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

}
