import java.util.Scanner;
public class prime_print {

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;}
        }
        return true;
    }

    public static void print(int n){
        System.out.println("prime numbers are: ");
        for(int i=2; i<=n; i++){
            if(isprime(i)==true){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }

    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number ; ");
        int n=s.nextInt();
        print(n);
    }
}
