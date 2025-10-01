import java.util.Scanner;
public class prime_not {
//    public static boolean check(int n){
//        boolean check=true;
//        for(int i=2; i<n-1; i++){
//            if(n%i==0){
//                check=false;
//            }
//        }
//        return check;
//    }

    public static boolean check(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] arg){
        int n;
        System.out.print("enter a number : ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(check(n)==true){
            System.out.println("number is  prime ");
        }
        else{System.out.println("number is not prime ");}
    }

}
