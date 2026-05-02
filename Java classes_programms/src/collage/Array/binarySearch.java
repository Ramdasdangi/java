package collage.Array;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

    public static void binary_Search(int[] number , int key) {
        System.out.println("By binary search ");
        Arrays.sort(number);

        int r = -1, start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                System.out.println("Element is found. ");
                r = 1;
                break;
            }
            if(number[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(r==-1){
            System.out.println("Element not found. ");
        }
    }

    public static void input(int[] arr ,int n, Scanner sc){

        for (int i = 0; i < n; i++) {
            System.out.println("enter "+i+" element : ");
            arr[i]=sc.nextInt();
        }
    }

    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of element : ");
        int n=s.nextInt();
        int[] arr=new int[n];
        input(arr,n,s );

        System.out.print("enter element which you want to search : ");
        int key=s.nextInt();
        binary_Search(arr,key);

        s.close();
    }
}
