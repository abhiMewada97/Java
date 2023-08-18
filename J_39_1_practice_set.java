class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public void setName(String ch){
        name = ch;
    }

    public String getName(){
        return name;
    }
}

public class J_39_1_practice_set {
    public static void main(String[] args){
        
        Employee obj = new Employee();
        obj.salary = 23;
        obj.setName("Abhishek");
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }
    
}
