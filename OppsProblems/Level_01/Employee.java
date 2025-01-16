// Create a class Employee with the following private data members
class Employee{
    // 
    private String name;
    private int id;
    private int salary;
    // Create a constructor Employee(String name, int id, int salary) that initializes the instance variables.
    Employee(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    // Create a method display() that displays the employee name, id, and salary.
    private void display(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+salary);

    }
//}

//class Main{
    public static void main(String[] args) {
        Employee e=new Employee("Pankaj",116,18000);
        e.display();
    }
}