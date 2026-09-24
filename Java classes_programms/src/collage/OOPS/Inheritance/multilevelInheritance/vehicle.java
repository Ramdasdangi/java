package collage.OOPS.Inheritance.multilevelInheritance;

class Vehicles {
    Vehicles() {
        System.out.println("this is vehicle");
    }
}
class fourWheeler extends Vehicles{
    fourWheeler(){
        System.out.println("4 wheeler vehicle");
    }
}
class car extends fourWheeler{
    car(){
        System.out.println("This is my car");
    }
}
public class vehicle{
    public static void main(String[] arg){
        car ob=new car();

    }
}

