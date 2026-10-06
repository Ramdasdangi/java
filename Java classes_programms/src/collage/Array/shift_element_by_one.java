package collage.Array;

public class shift_element_by_one {
    public static void main(String[] arg){
        int[] arr = {5,2,9,1,7,3};

        int l=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=l;
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
