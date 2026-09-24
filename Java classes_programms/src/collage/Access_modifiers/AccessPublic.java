package collage.Access_modifiers;

class demo{

        public String name = "Ram";

        public void display(){
            System.out.println("name ; "+name);
        }

}

class AccessPublic {
    public static void main(String[] arg){
        demo ob=new demo();
        System.out.println(ob.name);
        ob.display();
    }

}
//create program for all access modifier