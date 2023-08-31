package CollectionTypes;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);

        System.out.println("Numbers: " + numbers);
        System.out.println("Does it contain 4? " + numbers.contains(3));

    }

}