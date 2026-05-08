package collage.Array;

import java.util.Scanner;

public class jaggedArray {

    public static void without_user(){
        int[][] arr = new int[3][];
        arr[0] = new int[]{1, 2};
        arr[1] = new int[]{3, 4, 5};
        arr[2] = new int[]{6};

        System.out.println("JAGGED ARRAY ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void user(Scanner s){
        int x,y;
        System.out.print("Enter row of main array : ");
        x=s.nextInt();
        System.out.print("Enter column of main array : ");
        y=s.nextInt();

    }
    public static void main(String[] arg) {
        Scanner s=new Scanner(System.in);

        user(s);
        without_user();
    }
}