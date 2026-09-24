package collage.OOPS.constructor;


    class newCopy{
        newCopy(newCopy obj2){
            this.name=obj2.name;
            this.id=obj2.id;
        }

        String name;
        int id;

        newCopy(String name,int id){
            this.name=name;
            this.id=id;
        }
    }


public class copyConstructor {
    public static void main(String[] arg){
        System.out.println("first Object");
        newCopy t1=new newCopy("Ramdas",10);

        System.out.println("employee name"+t1.name+" emloyee id "+t1.id);
        System.out.println();

        newCopy t2=new newCopy(t1);

        System.out.println("Copy constructor use second Object");

        System.out.println(
                "Employee name "+t2.name+" EmploId : "+t2.id
        );
    }
}
