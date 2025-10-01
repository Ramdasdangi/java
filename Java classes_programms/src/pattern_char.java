import java.util.Scanner;
public class pattern_char {
    public static void main(String arg[]){
        char a='A';
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Enter number line : ");
        n=s.nextInt();
        int b=65;

        System.out.println();

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(a+" ");
                a++;

            }
            System.out.println();
            for(int j=0; j<=i; j++){

                System.out.print(b+" ");
                b++;
            }
            System.out.println("\n");

        }
    }
}
