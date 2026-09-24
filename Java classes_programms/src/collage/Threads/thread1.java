package collage.Threads;
import java.io.*;
import java.util.*;

class myThread extends Thread{

    public void run(){
        String str="Thread started running..";
        System.out.println(str);
    }
}
public class thread1 {
    public static void main(String[] arg){

        myThread t1=new myThread();

        t1.start();
    }
}
