import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] arg){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number to fibonacci series ");
        n=s.nextInt();
        int a=0 , b=1;
        System.out.println("Fibonacci series : ");
//        System.out.println(a);
//        System.out.println(b);
        for(int i=0; i<n; i++){
            System.out.println(a);
            int t=a+b;
            a=b;
            b=t;
//            System.out.println(t);
        }
    }
}
