import java.util.*;

public class firstclass {
    public static void main (String args[]){

    Scanner sc = new Scanner(System.in);
        System.out.print("enter age : ");
    int age= sc.nextInt();

    if(age>18){
        System.out.println("adult");
    }
    else if(age==12){
        System.out.println("not adult");
    }else{
        System.out.println("ram");
    }

     /*Scanner sc =new Scanner(System.in);
     System.out.println("Enter name");
     String name = sc.nextLine();
        System.out.printf(name);*/

      /*  System.out.println("ram ".repeat(3));
        String st="ram ";
        String r="";
        for(int i=0; i<5; i++){
            r+=st;
        }
        System.out.printf(r);*/

    }
}
