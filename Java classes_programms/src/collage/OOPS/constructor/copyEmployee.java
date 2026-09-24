package collage.OOPS.constructor;

    class Employee{
        int empId;
        String name;
        double salary;

        Employee(int empId,String name, double salary){
            this.empId=empId;
            this.name =name;
            this.salary=salary;
        }

        Employee(Employee e){
            empId=e.empId;
            name=e.name;
            salary=e.salary;
        }

        void display(){
            System.out.println(empId+" "+name+" "+salary);
        }

    }

public class copyEmployee {

    public static void main(String[] arg){
        Employee emp=new Employee(01,"Ramdas",5000);

        Employee emp1=new Employee(emp);

        emp.display();
        emp1.display();
    }
}
