package collage.Access_modifiers;

class bank{
    private int balance=582888;

    private void showBalance(){
        System.out.println("your balance is : "+balance);
    }

    public void accesPrivate(){
        showBalance();
    }
}

public class private_modifier {
    public static void main(String[] ar){
        bank o=new bank();

//        System.out.println(o.balance); // error because balance is private which not accessible in another class
//        o.showBalance;  // error because it alse private

        o.accesPrivate();
    }
}
