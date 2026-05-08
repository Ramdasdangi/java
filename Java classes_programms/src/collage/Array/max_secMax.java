package collage.Array;

import java.util.Scanner;

public class max_secMax {
    public static void main(String[] ar){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of element : ");
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter "+i+" element : ");
            arr[i]=s.nextInt();
        }
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>m1){
                int temp=m1;
                m1=arr[i];
                m2=temp;
            }
            else if(arr[i]>m2 && arr[i]<m1){
                m2=arr[i];
            }

        }
        System.out.println("max element : "+m1);
        System.out.println("second max element : "+m2);
        System.out.println("sum of max and second max : "+m1+m2);
    }
}
