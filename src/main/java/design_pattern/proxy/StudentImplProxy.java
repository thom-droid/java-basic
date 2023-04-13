package design_pattern.proxy;

import java.time.LocalTime;
import java.util.Objects;

public class StudentImplProxy extends StudentImpl {

    public StudentImplProxy(int id, String name) {
        super(id, name);
    }

    @Override
    public void attend(Lecture lecture) {
        LocalTime lectureTime = lecture.getTime();

        if (LocalTime.now().isAfter(lectureTime) && !super.isAttending(lecture)) {
            System.out.println("you're late to the lecture " + lecture.getName());
            return;
        }

        System.out.println("you're not late. attending the class");
        super.getAttendances().stream().filter(attendance -> Objects.equals(attendance.getLecture(), lecture))
                .findFirst().ifPresent(attendance -> attendance.setPresent(true));
    }

}
