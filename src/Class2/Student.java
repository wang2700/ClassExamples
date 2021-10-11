package Class2;

import java.util.List;

public class Student {
    private String name;
    private String address;
    private List<String> classes;
    private List<String> grades;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getClasses() {
        return classes;
    }

    public List<String> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public void setGrades(List<String> grades) {
        this.grades = grades;
    }
}
