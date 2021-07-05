import static java.lang.Math.round;

public class Container {
    public static void main(String[] args) {

        Salary<Integer> engineerSalary = new Salary<Integer>(100);
        Employee<Integer> engineer = new Employee<Integer>(1 , "Mike" , engineerSalary);

        Salary<Float> managerSalary = new Salary<Float>(199.33F);
        Employee<Float> manager = new Employee<Float>(2,"Bill",managerSalary);

        engineer.getData();
        manager.getData();


    }
}

class Employee<T>{

    private int id ;
    public String name ;

    public Salary<T> employeeSalary;


    // default constructor
    public Employee(){
        this.id = 1 ;
        this.name = "John" ;
    }

    // custom constructor
    public Employee(int id , String name , Salary<T> employeeSalary){
        this.id = id ;
        this.name = name ;
        this.employeeSalary = employeeSalary ;
    }

    public void getData(){
        System.out.println("id=" + this.id + " name= " + this.name + " salary=" + this.employeeSalary.salary);
    }

    public void setData(int id , String name , Salary<T> employeeSalary){
        this.id = id ;
        this.name = name ;
        this.employeeSalary = employeeSalary ;
    }
}

// generic class
class Salary<T>{
    public T salary ;
    public float extra ;

    public Salary(T salary){
        this.salary = salary ;
        this.extra = 0 ;
    }

    public Salary(T Salary , float extra){
        this.extra = extra ;
        this.salary = Salary ;
    }
}
