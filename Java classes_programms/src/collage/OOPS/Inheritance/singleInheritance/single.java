package collage.OOPS.Inheritance.singleInheritance;

class vehicle{

    vehicle(){
        String name="this is my car";
        System.out.println("this is a vehile");
    }
}
class car extends vehicle{
    car(){
        System.out.println("this is car ");
    }
    void display(){
//        System.out.println(name);
    }
}
public class single {
    public static void main(String[] arg) {
        car c = new car();
    }
}
