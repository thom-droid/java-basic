package design_pattern.proxy;

import java.util.Objects;

public class AttendanceAlarm {

    public static void checkAttendance(Student student, Lecture lecture) {
        if (!Objects.nonNull(student)) {
            throw new RuntimeException("no student.");
        }

        if (!lecture.checkIfPresent(student)) {
            System.out.println(student.getName()+ " is not present. lecture: " + lecture.getName() + ". sending alarm to the student");
            notifyStudent(student, lecture);
            return;
        }

        System.out.println(student.getName() + " is attending the class.");
    }

    private static void notifyStudent(Student student, Lecture lecture) {
        student.attend(lecture);
    }

}
