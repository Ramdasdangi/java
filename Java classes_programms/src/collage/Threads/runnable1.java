package collage.Threads;
import javax.swing.plaf.TableHeaderUI;
import java.io.*;
import java.util.*;

class student1 implements Runnable{

//    method to start Thread
    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println("Stu1 "+i);
        }
    }
        }

class students2 implements Runnable{
    public void run(){
        for (int i = 6; i <=10;i++) {
            System.out.println("stu2 "+i);
        }
    }
}

public class runnable1 {
    public static void main(String[] arg){

        student1 s1=new student1();
        students2 s2=new students2();

//        Initialize thread
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2);

        t1.start();
        t2.start();
    }
}
