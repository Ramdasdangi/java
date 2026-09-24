package collage.OOPS.constructor;

public class parametrized {
    static class Today{
        String name;
        int id;
        Today(String name,int id){
            this.name=name;
            this.id=id;
        }
        void display(){
            System.out.println("student name : "+name);
            System.out.println("student id is "+id);
        }
    }

    public static void main(String[] arg){
       Today s=new Today("Ram",10);
       s.display();
    }
}
