package ro.fasttrackit.curs1;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Hallo world");

        List<Person> people = generatePeople();
        System.out.println(people);
        System.out.println("Hello World");
        //alta linie`

        Set<String> s;
        String substr = "Nume".substring(2, 3);

        Person marius = handleMarius();
        String newName = marius.changeName("Darius");
        String name2 = marius.changeName("new-name");

        System.out.println(marius.changeName("test"));
        Product lapotop = new Product(1, "lapotop", 1000);
    }

    private static Person handleMarius() {
        Person marius = new Person("Marius");
        marius.newMethod();
        marius.alta();
        marius.test();
        marius.ceAmNevoie();
        return marius;
    }

    private static List<Person> generatePeople() {
        List<Person> people = List.of(
                new Person("Mihai"),
                new Person("Maria"),
                new Person("Ana"),
                new Person("Ioan")
        );
        return people;
    }


    void newMethod() {
        System.out.println("ceva");
        int a = 1 + 2;
    }

    private static void ceva() {
        System.out.println("ceva");
    }


}

record Person(String name) {
    public void newMethod() {
        System.out.println("new implementation");
    }

    public void alta() {
        System.out.println("new one");
    }

    public String changeName(String newName) {
        return newName;
    }

    public void test() {

    }

    public void ceAmNevoie() {

    }
}