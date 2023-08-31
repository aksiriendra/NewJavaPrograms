package CollectionTypes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Nissan");
        cars.add("Mazda");

        System.out.println("Cars: " + cars);

        System.out.println("Third car: " + cars.get(2));

        cars.remove("Nissan");

        System.out.println("Cars: " + cars);

    }

}