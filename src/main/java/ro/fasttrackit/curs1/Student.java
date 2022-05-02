package ro.fasttrackit.curs1;

import java.util.ArrayList;
import java.util.List;

record StudentRecord(String name, List<Integer> grades) {
}

public final class Student {
    private final String name;
    private final List<Integer> grades;
    private final int count = 1;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>(grades);
    }

    public String getName() {
        return name;
    }

//    public void addGrade(int grade) {
//        this.grades.add(grade);
//    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return grades != null ? grades.equals(student.grades) : student.grades == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (grades != null ? grades.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
