package collage.Array;
import java.util.Scanner;

public class array_2D_integers {
    public static void main(String[] ar){
        Scanner s=new Scanner (System.in);
        System.out.print("Enter the number Row you want to store : ");
        int r=s.nextInt();
        System.out.print("Enter the number Column you want to store : ");
        int c=s.nextInt();

        int[][] arr=new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter element  "+i+"X"+j+" : ");
                arr[i][j]=s.nextInt();
            }
        }

        System.out.println("you entered ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
