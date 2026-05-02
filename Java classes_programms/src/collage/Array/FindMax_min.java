package collage.Array;

import java.util.Scanner;

public class FindMax_min {

//    This is by using user input
    public static void input(int[] arr, int size,Scanner s){
        for (int i = 0; i < size; i++) {
            arr[i]=s.nextInt();
        }

    }

//    This is method to find maximum number from a array
    public static void maxi(int[] arr){
//        int max=arr[0];
        int max=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("maximum element is : "+max);
    }

//    This is method to find Minimum number from a array
    public static void mini(int[] arr){
//        int min=arr[0];
        int min=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min=arr[0];
        }
        System.out.println("minimum number is : "+min);
    }

//    This method for find maximum and minimum element from array by using only one  for loop
    public static void max_min(int[] arr){
        int min=Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;

        for(int i=0; i<arr.length ; i++){
            if(max<arr[i]){
                    max=arr[i];
            }
            if(min >arr[i]){
                min =arr[i];
            }
        }

        System.out.println("lagest number is : "+ max);
        System.out.println("Smallest element is : "+ min);
    }

    public static void main(String[] arg){
//        int[] arr={10,2,45,7,58,6,14};
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=s.nextInt();
        int[] arr=new int[size];

        input(arr,size,s);
//        maxi(arr);
//        mini(arr);
        max_min(arr);

        s.close();
    }
}
