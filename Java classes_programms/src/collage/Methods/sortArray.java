package collage.Methods;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] arg){
        int[] arr={5,8,6,2,7,6,15,1,2,3};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("Sorted array is ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
