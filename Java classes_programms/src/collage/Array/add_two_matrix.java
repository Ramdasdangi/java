package collage.Array;

import java.util.Scanner;

public class add_two_matrix {

//    public static void without_user(int[][] arr1 , int[][] arr2){
//        int arr1={
//                {4 3 6},
//                {2,3 1}
//                {6,8,4}
//        };
//       int arr2={
//                {0,2,3}
//                {2,3,1}
//                {3,1,5}
//        }
//
//    }

    public static void user(int r, int c, int[][] arr1, int[][] arr2, int[][] sum ,Scanner s){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("enter element "+i+"X"+j+" of first matrix : ");
                arr1[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("enter element "+i+"X"+j+" of second matrix : ");
                arr2[i][j]=s.nextInt();
            }
        }
        System.out.println("Added array is : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void add(int r, int c, int[][] arr1, int[][] arr2){}

    public static void main(String[] ag){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int r=s.nextInt();
        System.out.print("Enter number of coloum : ");
        int c=s.nextInt();

        int[][] arr1=new int[r][c];
        int[][] arr2=new int[r][c];
        int[][] sum=new int[r][c];
        user(r,c,arr1,arr2,sum,s);

//        without_user(arr1,arr2);

}}


//  4 3 6     0 2 3      4 5 9
//  2 3 1  +  2 3 1  =   4 5 2
//  6 8 4     3 1 5      9 9 9

//  Add two 3D aaray  , find max and mini from 2D array
