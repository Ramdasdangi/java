import java.util.Scanner;
public class pattern_hollow_rect {

    public static void hollow_rect(int row, int coloumn){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=coloumn; j++){
                if(i==1|| i==row || j==1 || j==coloumn ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] arg){
        int row,coloumn;
        Scanner s=new Scanner(System.in);
        System.out.print("enter number of row : ");
        row=s.nextInt();
        System.out.println("enter number of coloumn : ");
        coloumn=s.nextInt();
        hollow_rect(row , coloumn);
    }
}
