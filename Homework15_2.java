package Homework15;

import java.util.*;

public class Homework15_2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        queue.add(45);
        queue.add(32);
        queue.add(15);
        queue.add(67);
        queue.add(17);
        queue.add(92);
        queue.add(8);
        queue.add(27);
        queue.add(56);
       while (queue.size() != 0) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
