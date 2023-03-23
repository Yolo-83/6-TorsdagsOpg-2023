import java.util.ArrayList;

public class Student extends Person{   // Denne klasse arver fra klassen 'Person'

    public Student(String name, ArrayList passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();

    }

    ArrayList<String> passedCourses;

    ArrayList<String> currentCourses;


    @Override
    boolean addCourse(String course) {   //
        for (int i = 0; i < passedCourses.size(); i++){
            if (course.equals(passedCourses.get(i))){
                return false;
            }
        }
        currentCourses.add(course);
        return true;
    }

}
