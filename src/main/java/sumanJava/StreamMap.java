package sumanJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akhil", "Priyatham", "Upendra");

        List<Integer> nameLength = names.stream().map(String::length).collect(Collectors.toList());

        System.out.println("Length of the stream: " + nameLength);
    }

}