package CollectionTypes;

import java.util.ArrayList;

public class ArrayandArrayList {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 10;
        array[1] = 12;
        array[2] = 11;

        System.out.println("Array: " + array);

        int[] newarray = {1, -2, 3, 4, 5, 6};

        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);

        System.out.println("ArrayList");

    }
}