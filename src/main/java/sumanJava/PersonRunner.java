package sumanJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRunner {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(

                new Person("Akhil", 28), new Person("Ramya", 35), new Person("Sanjeev", 32),
                new Person("Laxmipathi", 40)

        );

        List<Person> youngpeople = people.stream().filter(person -> person.getAge() < 35).collect(Collectors.toList());

        System.out.println("Young People: " + youngpeople);

    }

}