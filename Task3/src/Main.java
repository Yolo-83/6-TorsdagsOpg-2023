import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList <Person> persons = new ArrayList<>();
        Student student1 = new Student("Yolo", new ArrayList<>(Arrays.asList("Math", "Java 1.0")));
        Student student2 = new Student("Jack", new ArrayList<>(Arrays.asList("Math", "Java 1.0")));
        Student student3 = new Student("Ingrid", new ArrayList<>(Arrays.asList("Python", "Java 1.0")));
        Student student4 = new Student("Anders", new ArrayList<>(Arrays.asList("Math", "Python")));

        Teacher teacher1 = new Teacher("Mark", new ArrayList<>(Arrays.asList("Math", "Java 1.0")));
        Teacher teacher2 = new Teacher("Signe", new ArrayList<>(Arrays.asList("Python", "Java 1.0")));
        Teacher teacher3 = new Teacher("Peter", new ArrayList<>(Arrays.asList("C++", "Python")));
        Teacher teacher4 = new Teacher("Tess", new ArrayList<>(Arrays.asList("Historie", "Dansk")));


        System.out.println(student1);
    }
}