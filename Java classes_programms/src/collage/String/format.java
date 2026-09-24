//return a formatted string:

package collage.String;

public class format {
    public static void main(String[] ar){
        String s="Hello %s! One kilobyte is %,d bytes.";
        String result=String.format(s,"World",1024);
        System.out.println(result);


        String s1="HELLO %s! \n\tIf we divide %d by %d than answer is %.2f.";
        String r1=String.format(s1,"Bachcho",5,2,2.5);
        System.out.println(r1);
    }
}
