class Employee{
    int num;
    String name;

    Employee(){
        num = 23;
        name = "Abhishek";
    }
    Employee(int n, String nm){
        num = n;
        name = nm;
    }

    int getData(){
        return num;
    }

    String getName(){
        return name;
    }

}

class J_42_2_constructor_overloading{
    public static void main(String [] args){
        Employee obj1 =new Employee();
        Employee obj2 =new Employee(34,"Abhi");
        
        System.out.println(obj1.getName());
        System.out.println(obj1.getData());
        System.out.println(obj2.getName());
        System.out.println(obj2.getData());
    }
}