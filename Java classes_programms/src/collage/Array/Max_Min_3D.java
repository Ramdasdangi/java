package collage.Array;

import java.util.Scanner;

public class Max_Min_3D {

    public static void max_min(int[][][] arr,int n,int r,int c){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

//        int i = 0,j = 0,k = 0;

        for (int i=0; i < n; i++) {
            for (int j=0; j < r; j++) {
                for (int k=0 ; k < c; k++) {
                    if(max<arr[i][j][k]){
                        max=arr[i][j][k];

                    }
                    if(min>arr[i][j][k]){
                        min=arr[i][j][k];
                    }
                }
            }
        }

        System.out.println("max in 3D array is : "+max);
        System.out.println("min in 3D array is : "+min);

    }


    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of leyer : ");
        int n=s.nextInt();
        System.out.print("Enter number of rows : ");
        int r=s.nextInt();
        System.out.print("Enter number of Column : ");
        int c=s.nextInt();

        int [][][] arr=new int[n][r][c];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print("Enter "+i+"X"+j+"X"+k+" : ");
                    arr[i][j][k]=s.nextInt();
                }
            }
        }

        max_min(arr,n,r,c);


    }
}
