package collage.Exception_Handling;

public class try_catch_array {
    public static void main(String[] arg){
        int[] ar={1,25,8,9};
        System.out.print("array is : ");
        for (int i = 0; i < ar.length+1 ; i++){
            try{
                System.out.print(ar[i]+" ");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println();
                System.out.println(e);
            }
        }

    }
}
