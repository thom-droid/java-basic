package design_pattern.proxy;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class AttendanceAlarmTest {

    @Test
    void checkAttendance() {

        Lecture lecture1 = new Lecture("computer science", 1, LocalTime.of(10, 30));
        Lecture lecture2 = new Lecture("algorithm", 2, LocalTime.of(16, 0));
        Lecture lecture3 = new Lecture("cooking", 3, LocalTime.of(14, 0));

        Student student = new StudentImplProxy(1, "Thom");
        student.register(lecture1);
        student.register(lecture2);

        AttendanceAlarm.checkAttendance(student, lecture1);
        AttendanceAlarm.checkAttendance(student, lecture2);

        assertThrows(RuntimeException.class, () -> AttendanceAlarm.checkAttendance(student, lecture3));

    }
}