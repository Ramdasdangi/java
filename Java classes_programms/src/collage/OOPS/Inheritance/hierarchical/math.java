package collage.OOPS.Inheritance.hierarchical;

class arthmetics{
    arthmetics(){
        int a=50;
        int b=10;
        System.out.println("a : 50 , b:10");
    }

}
class addition extends arthmetics{
    addition(int a,int b){
        System.out.println("a + b = "+a+b);
    }
}
class divide extends arthmetics{
    divide(int a, int b){
        System.out.println("a / b = "+a/b);
    }
}
class multiply extends  arthmetics{
    multiply(int a , int b){
        System.out.println("a * b = "+a*b);
    }
}

public class math {
    public static void main(String[] ar){
        arthmetics arth=new arthmetics();
//        addition a=new addition(arth);
//        divide d=new divide();
//        multiply m=new multiply();
    }
}
