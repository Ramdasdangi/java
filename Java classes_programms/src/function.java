import java.util.Scanner;
public class function {
    public static float average(int a,int b,int c){
        float x=(a+b+c)/3f;
        System.out.println(x);
        return x;

    }
public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float x=average(a,b,c);
//    float y=(a+b+c)/3f;
    System.out.println(x);

}
}

