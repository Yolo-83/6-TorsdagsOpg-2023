import java.io.File;
import java.util.ArrayList;

public class Teacher extends Person {   // Denne klasse arver fra klassen 'Person'

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }


    ArrayList<String> canTeach;

    ArrayList<String> currentCourses;


    @Override
    boolean addCourse(String course) {   //
        for (int i = 0; i < canTeach.size(); i++) {
            if (course.equals(canTeach.get(i))) {
                return false;
            }
        }
        currentCourses.add(course);
        return true;
    }

}
