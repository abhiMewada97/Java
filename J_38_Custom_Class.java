class Custom{
    int num,salary;
    String name;

    public void printData(){
        System.out.println("Number is "+num);
        System.out.println("Name is "+name);
    }

    public int returnData(){
        return salary;
    }
}

public class J_38_Custom_Class {
    public static void main(String [] args){
        Custom obj1 = new Custom(); //Intantiating new Custom object object
        Custom obj2 = new Custom();
        // Setting Attribute 
        obj1.num = 12;
        obj2.num = 36;
        obj1.salary = 12000;
        obj1.name = "Abhishek";
        obj2.name = "Rahul";

        obj1.printData();
        obj2.printData();
        int salary = obj1.returnData();
        System.out.println(salary);
        // System.out.println(obj.num);
        // System.out.println(obj.name);
    }
}