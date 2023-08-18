class Employee{
    int num;
    String name;

    Employee(){
        num = 23;
        name = "Abhishek";
    }
    
    int getData(){
        return num;
    }

    String getName(){
        return name;
    }

}

class J_42_1_constructor{
    public static void main(String [] args){
        Employee obj1 =new Employee();
        
        System.out.println(obj1.getName());
        System.out.println(obj1.getData());
    }
}