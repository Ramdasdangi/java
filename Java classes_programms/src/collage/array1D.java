package collage;
import java.util.Scanner;

public class array1D {
    public static void main(String[] ar){
        Scanner s=new Scanner (System.in);
        System.out.print("Enter the number of element you want to store : ");
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();

        }
        System.out.println("you entered ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
}
