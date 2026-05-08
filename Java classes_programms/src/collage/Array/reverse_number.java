package collage.Array;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] ar){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number of multi digits : ");
        int n=s.nextInt();

        int re=0,rema;
        while(n!=0){
            rema=n%10;
            re=re*10+rema;
            n/=10;
        }
        System.out.println("reverse number is "+re);
    }
}
