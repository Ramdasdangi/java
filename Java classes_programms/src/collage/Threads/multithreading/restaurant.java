package collage.Threads.multithreading;

class cookingTask extends Thread{
    private String task;

    cookingTask(String task){
        this.task=task;
    }

    public void run(){
        System.out.println(task+" is being prepared by ");
        Thread.currentThread().getName();
    }
}

public class restaurant {
    public static void main(String[] arg){

        Thread t1=new cookingTask("Pasta");
        Thread t2=new cookingTask("Salad");
        Thread t3=new cookingTask("Dessert");
        Thread t4=new cookingTask("Rice");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
