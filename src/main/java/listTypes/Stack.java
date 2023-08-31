package listTypes;

import java.util.Deque;
import java.util.LinkedList;

public class Stack {

    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(5);
        stack.push(3);
        stack.push(3);

        System.out.println(+stack.pop());

    }

}
