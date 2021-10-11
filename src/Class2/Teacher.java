package Class2;

import java.util.List;

public class Teacher {
    private String name;
    private String address;
    private List<String> classes;
    private double salary;
    private int numYears;

    public Teacher(String name, String address, List<String> classes, double salary, int numYears) {
        this.name = name;
        this.address = address;
        this.classes = classes;
        this.salary = salary;
        this.numYears = numYears;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
