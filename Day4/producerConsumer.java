package Day4;

import java.nio.IntBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.management.Query;

public class producerConsumer {

    public static void main(String[] args) {

        LinkedList<Integer> buffer = new LinkedList<Integer>();
        final int capacity = 5;
        int value = 0;
        Runnable producer = new Runnable() {
            @Override
            public void run() {

                try {
                    synchronized (buffer) {
                        if (buffer.size() == capacity) {
                            System.out.println("producer is waiting");
                        } else {
                            buffer.push((int) ((Math.random() * (10000 - 1)) + 1));
                        }
                    }

                } catch (Exception e) {
                    System.out.println("oops");
                    e.printStackTrace();
                }
            }

        };

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (buffer) {
                        if (buffer.isEmpty()) {
                            System.out.println("consumer is waiting");

                        } else {
                            // System.out.println(buffer.pop());
                        }
                    }
                } catch (Exception e) {
                    System.out.println("oops");
                    e.printStackTrace();
                }
            }

        };

        while (true) {
            producer.run();
            consumer.run();
        }
    }
}
