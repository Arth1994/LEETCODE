import java.util.*;

class Hi extends Thread{

    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("HI");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread{

    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String args[]) {
        Hi hi = new Hi();
        Hello hello = new Hello();
        //hi.start();
        //hello.start();
        hi.run();
        hello.run();
    }
}