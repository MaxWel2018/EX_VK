package sumdu;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person   {

    private String name;
    private int age;
    private boolean isMale;
    Pattern pattern = Pattern.compile("^[А-Яа-яёЁ]{3,15}$");
    Matcher matcher;



    public Person(String name, int age, boolean isMale)  {
        matcher = pattern.matcher(name);
        if (matcher.matches()) {
            this.name = name;
        }else{
            throw  new IllegalArgumentException("Имя Введено не корректно.Убедитесь в правильности Ввода и повторите попытку!");
        }
        if (age>=0) {
            this.age = age;
        }else{
            throw  new IllegalArgumentException("Возвраст не должен быть отрицательным");


        }
        this.isMale = isMale;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                isMale == person.isMale &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isMale);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale;
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }
    public boolean isMale() {
        return isMale;
    }
}
