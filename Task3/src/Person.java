public class Person {
    private String name; // Feltet

    public Person(String name) {   // Konstruktør
        this.name = name;
    }

    public String getName() {    // Getter
        return name;
    }

    public void setName(String name) {   // Setter
        this.name = name;
    }

    boolean addCourse(String course){    // Boolean med intet at returnere
        return true;
    }
}
