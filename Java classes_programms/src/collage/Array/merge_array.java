package collage.Array;

public class merge_array {
    public static void main(String[] arg){
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int t= arr1.length+arr2.length;

        int[] arr=new int[t];
        int in=0;
        for (int i = 0; i < arr1.length; i++) {
            arr[in]=arr1[i];
            in++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[in]=arr2[i];
            in++;
        }

        for (int i = 0; i < t; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
