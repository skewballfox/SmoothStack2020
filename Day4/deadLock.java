package Day4;

import java.util.GregorianCalendar;

public class deadLock {
    public static void main(String[] args) {

        String string1 = "this";
        String string2 = "that";

        Runnable thread1 = new Runnable() {
            @Override
            public void run() {

                try {
                    synchronized (string1) {
                        Thread.sleep(100);
                        synchronized (string2) {
                            System.out.println("thread1 done");
                        }
                    }

                } catch (Exception e) {
                    System.out.println("oops");
                    e.printStackTrace();
                }
            }

        };

        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (string2) {
                        Thread.sleep(100);
                        synchronized (string1) {
                            System.out.println("thread2 done");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("oops");
                    e.printStackTrace();
                }
            }

        };

        System.out.println("program started");
        long start = System.currentTimeMillis();
        thread1.run();
        thread2.run();
        long end = System.currentTimeMillis();
        System.out.println("deadlock took : " + (end - start - 100) + " Ms");
    }
}
