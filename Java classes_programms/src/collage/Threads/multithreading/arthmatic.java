package collage.Threads.multithreading;

class add extends Thread {
    public void run() {
        int a = 20, b = 10;
        System.out.println("Addition = " + (a+b));
    }
}

class subtract extends Thread {
    public void run() {
        int a = 20, b = 10;
        System.out.println("Subtraction = " + (a-b));
    }
}

class multiply extends Thread {
    public void run() {
        int a = 20, b = 10;
        System.out.println("Multiplication = " + (a*b));
    }
}

class divide extends Thread {
    public void run() {
        int a = 20, b = 10;
        System.out.println("Division = " + (a/b));
    }
}

public class arthmatic {
    public static void main(String[] args) {
        add t1 = new add();
        subtract t2 = new subtract();
        multiply t3 = new multiply();
        divide t4 = new divide();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}