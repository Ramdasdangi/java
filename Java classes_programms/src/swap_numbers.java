import java.util.Scanner;

public class swap_numbers {
        public static void main(String[] arg){
            int a,b;
            System.out.print("Enter value of a and b : ");
            Scanner s=new Scanner(System.in);
            a=s.nextInt();
            b=s.nextInt();
            int t=a;
            a=b;
            b=t;

            System.out.println("after swaping value of a and b: "+a+" , "+b);
        }
}
