import java.util.Scanner;

public class array_2D {

    public static void input(int[][] array , int row , int column){
        Scanner sc = new Scanner (System.in);
        for(int i=0 ; i<row; i++){
            for(int j=0 ; j<column; j++){
                System.out.print("Enter "+i+"X"+j+" th element of Array : ");
                array[i][j] = sc.nextInt();
            }
        }
    }

    public static void print(int [][] array , int row , int column){
        for(int i=0 ; i<row; i++){
            for(int j=0 ; j<column; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print_spiral_matrix(int [][] array , int row , int column ){
        int r_start=0 , r_end=row-1 ;
        int c_start=0 , c_end=column-1;

        while (r_start <= r_end && c_start <= c_end){
            //Top
            for(int j=c_start ; j<=c_end; j++){
                System.out.print(array[r_start][j]+" ");
            }
            //Right end
            for(int i=r_start+1 ; i<=r_end ; i++){
                System.out.print(array[i][c_end]+" ");
            }
            //Bottom
            for(int j=c_end-1 ; j>=c_start ; j--){
                System.out.print(array[r_end][j]+" ");
            }
            //Left end
            for (int i = r_end-1; i > r_start; i--) {
                System.out.print(array[i][c_start]+" ");
            }
            c_start++;
            c_end--;
            r_start++;
            r_end--;
        }

    }

    public static void diagonal_sum(int [][] array , int n){

        int d_sum = 0 ;

      /*  // basic method to calc diagonal sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    d_sum += array[i][j];
                }
                else if(i+j==n-1)
                    d_sum += array[i][j];
            }
        } */

        for (int i = 0; i < n; i++) {
            d_sum += array[i][i];
            if(i != n-1-i)
                d_sum += array[i][n-1-i];
        }
        System.out.println("Sum of  diagonal element : "+d_sum);
    }

    public static void main(String [] arg){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of Row : ");
        int row = sc.nextInt();
        System.out.print("Enter number of Column : ");
        int column = sc.nextInt();
        int [][] matrix = new int[row][column];

//        input(matrix , row , column);

//        print(matrix , row , column);

//        print_spiral_matrix(matrix, row , column);

        if(row==column) {
            input(matrix, row, column);
            print(matrix , row , column);
            diagonal_sum(matrix, row);
        }
        else
            System.out.println("Diagonal sum is only valid for square matrix. ");



    }
}

/*

1  2  3  4
12 13 14 5
11 16 15 6
10 9  8  7

1  2  3  4  5
6  7  8  9  10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

*/
