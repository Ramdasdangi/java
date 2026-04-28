import java.util.Scanner;

public class palindrome {
    public static void main(String[] arg){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int t=n , r=0;
        while(t<0){
            int ld=t%10;
            r+=ld*10;
            t/=10;
        }

        if(r==n)
            System.out.println("number is palindrome ");
        else
            System.out.println("number is not palindrome ");

    }
}
