package collage.String;


public class copyValue {
    public static void main(String[] arg){
        char[] str1={'H','e','l','l','o'};
        String str2="";
        str2=str2.copyValueOf(str1,0,5);
        System.out.println("Returned String : "+str2);


    }
}
