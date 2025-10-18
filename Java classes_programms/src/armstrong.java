import java.util.Scanner;
public class armstrong {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();

        int num=n;
        int a,b=0;
        while (n>0){
            a=n%10;
            n/=10;
            b+=a*a*a;
        }
        if(num==b)
            System.out.println("Given number is armstrong number ");
        else
            System.out.println("Given number is not armstrong number ");

        sc.close();
    }
}
