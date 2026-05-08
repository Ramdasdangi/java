//with parameter no return value

package collage.Methods;

import java.util.Scanner;

public class armstrong {
    void checkArm(int num){
        int original=num,sum=0;

        while(num>0){
            int digit=num%10;
            sum+=digit*digit*digit; //this is only valid for 3 digit number
            num/=10;                //for more than 3 digit number we can find length of number
        }
        if(original==sum){
            System.out.println("it is armstrong number ");
        }
        else{
            System.out.println("it is not armstrong number ");
        }
    }

    public static void main(String[] ar){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=s.nextInt();
        armstrong ob=new armstrong();
        ob.checkArm(n);
    }
}
