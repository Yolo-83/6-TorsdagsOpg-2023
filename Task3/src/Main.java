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


        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(student4);
        persons.add(teacher1);
        persons.add(teacher2);
        persons.add(teacher3);
        persons.add(teacher4);

        for (int i = 0; i < persons.size(); i++) {
           if (persons.get(i).addCourse("Java 1.0")){

           } else {
               if(persons.get(i) instanceof Student){
                   System.out.println(persons.get(i).getName() + "Har bestået");
               }
               if(persons.get(i) instanceof Teacher){
                   System.out.println(persons.get(i).getName() + "Kan ikke undervise i dette fag");
               }
           }
        }
    }
}