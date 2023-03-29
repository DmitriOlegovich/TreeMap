import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Igor", "Nikolaev Vipem Za Lubov",37));
        people.add(new Person("Tanya", "Astahova Antuanetta",14));
        people.add(new Person("Olia", "Petrova La Plaza",45));
        people.add(new Person("Anya", "Bobova Diego Iushkina",16));


        people.removeIf(person -> person.getAge() < 18);

        people.sort(new LenghtSurnamePeople());

        System.out.println(people);

    }
}