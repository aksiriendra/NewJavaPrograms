package CollectionTypes;

import java.util.HashMap;
import java.util.Map;

public class HashMapMapCollection {

    public static void main(String[] args) {
        Map<Integer, String> grades = new HashMap<>();
        grades.put(100, "Akhil");
        grades.put(120, "Priyatham");
        grades.put(140, "Sanjeev");

        grades.remove(140);

        System.out.println("Grades: " + grades);
    }

}