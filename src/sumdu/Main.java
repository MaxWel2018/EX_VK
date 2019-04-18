package sumdu;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Person> listOfPerson = new HashSet<>();

        listOfPerson.add(new Person("Максим", 15, true));
        listOfPerson.add(new Person("Максим", 25, true));
        listOfPerson.add(new Person("  ", 25, true));
        listOfPerson.add(new Person("Максим", 8855, true));

        System.out.println(theOldestofList(listOfPerson));
    }

    public static Person theOldestofList(HashSet<Person> hashSet) {
        Person p = null;
        if (!hashSet.isEmpty()) {
            int maxAge = 0;
            for (Person o : hashSet) {
                if (o.getAge() > maxAge) {
                    maxAge = o.getAge();
                    p = o;
                }
            }
            return p;
        } else {

            throw new IllegalArgumentException("Ты чё творишь ?! Убедись в правильности передаваемого параметра , возможно он пуст!");
        }

    }
}
