package sumanJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingwithOne {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(23);
        numbers.add(11);
        numbers.add(33);
        numbers.add(45);

        List<Integer> numbersWithOne = numbers.stream().filter(n -> String.valueOf(n).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("Numbers starting with one: " + numbersWithOne);
    }

}