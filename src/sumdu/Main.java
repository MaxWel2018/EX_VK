package sumdu;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Person> listOfPerson = new HashSet<>();
        try {
            listOfPerson.add(new Person("Максим", 15, true));
            listOfPerson.add(new Person("Максим", 25, true));
            listOfPerson.add(new Person("  ", 25, true));


            listOfPerson.add(new Person("Максим", 8855, true));
        } catch (Exception e) {
            System.exit(-1);
        }


        try {
            System.out.println(theOldestofList(listOfPerson));
        } catch (IllegalArgumentException e) {
            System.out.println("Ты чё творишь ?! Убедись в правильности передаваемого параметра , возможно он пуст!");
            System.exit(-1);

        }

    }

    public static Person theOldestofList(HashSet<Person> hashSet) throws IllegalArgumentException {
        Person p = null;
        if (!hashSet.isEmpty()) {
            int maxAge = 0;
            for (Object o : hashSet) {
                if (((Person) o).getAge() > maxAge) {
                    maxAge = ((Person) o).getAge();
                    p = (Person) o;
                }
            }
            return p;
        } else {

            throw new IllegalArgumentException();
        }

    }
}
