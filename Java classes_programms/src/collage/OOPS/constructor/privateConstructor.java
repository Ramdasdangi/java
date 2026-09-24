package collage.OOPS.constructor;

public class privateConstructor {
    private privateConstructor() {
        System.out.println("private constructor called.");
    }
        void display(){
            System.out.println("Hello! This is Ramdas.");
        }

    public static void main(String [] arg){
        privateConstructor s=new privateConstructor();
        s.display();
    }
}
