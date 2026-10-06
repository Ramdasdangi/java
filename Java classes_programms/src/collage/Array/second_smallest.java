package collage.Array;

public class second_smallest {
    public static void main(String[] arg){
        int[] arr={8,6,2,4,7,5,4,8,1};
        int l=Integer.MAX_VALUE;
        int sl=Integer.MAX_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]<sl && arr[i] !=l){
                sl=arr[i];
            }
        }
        System.out.println("second smallest is "+sl);
    }
}
