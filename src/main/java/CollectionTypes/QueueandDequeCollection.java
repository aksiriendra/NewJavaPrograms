package CollectionTypes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueandDequeCollection {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(13);
        queue.add(14);

        System.out.println("Queue: " + queue);
        System.out.println("First in line: " + queue.poll());
        System.out.println("Queue: " + queue);
        System.out.println("First in line: " + queue.poll());
        System.out.println("Queue: " + queue);

    }

}
