package collage.test;

public class swap_number {
    public static void main(String[] arg) {
        int a = 5;
        int b = 20;

        System.out.println("before swaping a,b : "+a+" , "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swaping a,b : "+a+" , "+b);

    }
}
