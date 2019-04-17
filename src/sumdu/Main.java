package sumdu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        HashSet<Person> personTreeSet = new HashSet<>();

        personTreeSet.add(new Person("Max", 21, true));
        personTreeSet.add(new Person("Max", 21, true));
        personTreeSet.add(new Person("Max", 21, true));
        personTreeSet.add(new Person("Max", 21, true));
        personTreeSet.add(new Person("Hello", 21, true));
        personTreeSet.add(new Person("Max", 23, true));
        personTreeSet.add(new Person("Max", 225, true));
        System.out.println();


        System.out.println(nameMethod(personTreeSet));


    }

    public static Person nameMethod(HashSet<Person> hashSet) {
        Person p = null;
        List<Person> arr = new ArrayList<>(hashSet);
        if (!arr.isEmpty()) {
            int maxAge = 0;
            for (Object o : hashSet) {

                if (((Person) o).age > maxAge) {
                    maxAge = ((Person) o).age;
                    p = (Person) o;
                }
            }
            return p;
        } else {
            throw new NullPointerException();
        }

    }
}
