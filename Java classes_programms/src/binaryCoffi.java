import java.util.Scanner;

public class binaryCoffi {

    public static int fact(int n){
        int f=1;
        for(int i =1; i<=n; i++){
            f*=i;
        }
        return f;
    }

    public static int bCoff(int a ,int b){

        int nfact= fact(a);
        int rfact= fact(b);
        int nrfact=fact(a-b);
        int cof = nfact/(rfact*nrfact);
        return cof;

    }

    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int n,r;
        System.out.print("Enter number 'n':  ");
        n=s.nextInt();
        System.out.print("Enter number 'r':  ");
        r=s.nextInt();
        int co=bCoff(n,r);
        System.out.println("Binary cofficient is "+co);


    }
}
/*
co= n!/{r!(n-r)!}

 */