import java.util.Comparator;

public class LengthSurnamePeople implements Comparator<Person> {
    protected int maxSurname;
    protected int firstLength;
    protected int secondLength;

    public LengthSurnamePeople(int maxSurname) {
        this.maxSurname = maxSurname;
    }


    @Override
    public int compare(Person o1, Person o2) {
        String[] people1 = o1.getSurname().split(" ");
        String[] people2 = o2.getSurname().split(" ");
        firstLength = people1.length;
        secondLength = people2.length;

        if (people1.length > maxSurname)
            firstLength = maxSurname;


        if (people2.length > maxSurname) {
            secondLength = maxSurname;


            if (firstLength == secondLength) {
                return o1.getAge() - o2.getAge();
            } else {
                return firstLength - secondLength;
            }
        }
        return 0;
    }
}
