package collage.Array;
import java.util.Scanner;

public class codechef_max {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int n=s.nextInt();
            int[] ar=new int[n];
            for(int i=0; i<n; i++){
                ar[i]=s.nextInt();
            }
            int to=ar[0];
            for(int i=0; i<n; i++){
                if(to<ar[i]){
                    to=ar[i];
                }
            }
            System.out.println(to);

            t--;
        }

    }
}
