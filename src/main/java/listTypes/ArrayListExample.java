package listTypes;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Hyundai");

        System.out.println("Cars: " + cars);
        System.out.println("Size of the ArrayList: " + cars.size());

        cars.remove("Honda");

        System.out.println("Cars: " + cars);
        System.out.println("Size of the ArrayList: " + cars.size());

        System.out.println("Is Honda in the List: " + cars.contains("Honda"));

        for (String car : cars) {
            System.out.println(car);
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(0));
        }

    }
}