package collage.Ragular_Expression;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class passwordValidation {
    public static void main(String[] arg){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter a password : ");
        String pass=s.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

        Pattern pattern=Pattern.compile(regex);
        Matcher match=pattern.matcher(pass);

        if(match.matches())
            System.out.println("valid password ");
        else
            System.out.println("invalid password ");
    }
}
