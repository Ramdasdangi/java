import java.util.Scanner;
public class num_reverse {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int r=0;

        while(n!=0){
            int l=n%10;
            n/=10;
            r=(r*10)+l;
//            System.out.print(l);
        }
        System.out.print(r);
    }
}
