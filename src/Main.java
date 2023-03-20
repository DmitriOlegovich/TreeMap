import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Igor", "Nikolaev Vipem Za Lubov",37));
        people.add(new Person("Tanya", "Astahova Antuanetta",26));
        people.add(new Person("Olia", "Petrova La Plaza",45));
        people.add(new Person("Anya", "Bobova Diego Iushkina",28));



        people.sort(new LengthSurnamePeople(4));
        System.out.println(people);

    }
}