package collage.Array;
import java.util.Scanner;

public class array_1D_char {
    public static void main(String[] argg){
        Scanner s=new Scanner(System.in);
        System.out.print("enter number of  element of array : ");
        int n= s.nextInt();
        char[] arr=new char[n];
        s.nextLine();

        System.out.println("Enter " + n + " characters (without spaces):");
        String input=s.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i]=input.charAt(i);
        }

        System.out.println("enter array is : ");
        for(char c : arr){
            System.out.print(c);
        }

    }
}
