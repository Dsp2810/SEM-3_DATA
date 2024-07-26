import java.util.*;

public class PR7_4 {
    public static void main(String[] args) {
        Person person = createPerson("23CS058");
        System.out.println("Person's name: " + person.name);
        System.out.println("THIS PROGRAM IS PERFORED BY 23CS060-DHAVAL S PATEL");
    }

    public static Person createPerson(String name) {
        return new Person(name);
    }
}
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}


