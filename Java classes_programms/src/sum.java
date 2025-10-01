import java.util.Scanner;

public class sum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program for sum of two numbers ");
        int x,y,sum;
        System.out.println("enter first number ");
        x=sc.nextInt();

        System.out.println("enter second number ");
        y=sc.nextInt();

        sum=x+y;
        System.out.println("sum is : "+sum);
    }
}
