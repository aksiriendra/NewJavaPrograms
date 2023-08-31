package sumanJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesinaStream {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Akhil");
        names.add("Priyatham");
        names.add("Ramya");
        names.add("Ankitha");
        names.add("Sanjeev");
        names.add("Suman");
        names.add("Suman");
        names.add("Akhil");

        Set<String> uniqueNames = new HashSet<>();

        Set<String> duplicateNames = names.stream().filter(n -> !uniqueNames.add(n)).collect(Collectors.toSet());

        System.out.println("uniqueNames: " + uniqueNames);
        System.out.println("duplicateNames: " + duplicateNames);

    }
}
