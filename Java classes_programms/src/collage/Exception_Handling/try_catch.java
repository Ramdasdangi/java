package collage.Exception_Handling;

// The try block contains code that might throw an exception
// the catch block handles the exception if it occurs.

public class try_catch {
    public static void main(String[] arg){
        int n=10;
        int m=0;

        try{
            int ans=n/m;
            System.out.println("Answer : "+ans);
        }
        catch (ArithmeticException e){
            System.out.println(e+" Error : Divison by 0!");
        }
    }
}
