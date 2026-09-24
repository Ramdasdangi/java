package collage.Ragular_Expression;
import java.util.*;
import java.lang.*;
import java.io.*;
public class codechef_pass {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        while(t-->0){
            String pass=s.nextLine();

            int l=pass.length();


            if(l<10){
                System.out.println("no");
                continue;

            }

            boolean lower=false;
            boolean upper=false;
            boolean digit=false;
            boolean special=false;

            for(int i=0; i<l; i++){
                char c=pass.charAt(i);

                //lower
                if(c>='a' && c<='z' ){
                    lower=true;
                }

                //strictly inside charecter
                if(i>0 && i<l-1){

                    //upper
                    if(c>='A' && c<='Z'){
                        upper=true;
                    }

                    // digit
                    if(c>='0' && c<='9'){
                        digit=true;
                    }

                    //special
                    if(c=='@' || c=='#' || c=='%' || c=='&' || c=='?'){
                        special=true;
                    }
                }


            }
            if(lower && upper && digit && special){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }


        }

    }
    }


