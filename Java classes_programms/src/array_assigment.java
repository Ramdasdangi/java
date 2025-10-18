import java.util.Scanner;
public class array_assigment{

    public static void check_repeatation(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size/length of array : ");
        int s=sc.nextInt();
        int[] num= new int[s];
        System.out.println("Enter " +s+" integer value");
        for(int i=0; i<s;i++){
            num[i]=sc.nextInt();
        }
        boolean found=false;
        for(int i=0; i<s; i++){
            for(int j=i+1; j<s; j++){
                if(num[i]==num[j]) {
                    found = true;
                    break;
                }
            }
        }
        if(found)
            System.out.println("Some element/elements is/are repeated.");
        else
            System.out.println("There is no element which is repeat.");
    sc.close();
    }

    public static void profit_calc(){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter number of day : ");
        int n= sc.nextInt();
        int [] num=new int[n];
        for(int i=0; i<n; i++){
            System.out.printf("Enter price of %d day : ",i+1);
            num[i]= sc.nextInt();
        }
        int p=0;
        // 7 1 5 3 6 4
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if((num[j]-num[i])>p)
                    p=num[j]-num[i];
            }
        }
        System.out.println("profit "+p);

    }

    public static void main (String[] arg){
//        check_repeatation();
        profit_calc();
    }
}
