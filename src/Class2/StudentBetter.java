package Class2;

import java.util.List;

public class StudentBetter extends Person {
    private List<String> classes;
    private List<String> grades;

    public StudentBetter(String name, String address, List<String> classes, List<String> grades) {
        super(name, address);
        this.classes = classes;
        this.grades = grades;
    }

    public List<String> getClasses() {
        return classes;
    }

    public List<String> getGrades() {
        return grades;
    }
}
