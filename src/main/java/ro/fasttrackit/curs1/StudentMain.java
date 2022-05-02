package ro.fasttrackit.curs1;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Integer> myGrades = List.of(10, 3, 5);

        Student marian = new Student("Marian", myGrades);
        System.out.println(marian);
        List<Integer> grades = marian.getGrades();
        grades.set(1, 10);
        System.out.println(grades);
        System.out.println(marian);

//        myGrades.set(1, 10);
//        System.out.println(marian);

//        marian.addGrade(7);
        System.out.println(marian);

        String referintaLaState = marian.getName();
        referintaLaState.substring(1,2);
    }
}
