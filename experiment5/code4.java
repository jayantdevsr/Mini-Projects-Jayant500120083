package JAVA.experiment5;
class Employee {
    protected String name;
    protected int empid;
    protected double salary;

    public Employee() {
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += (salary * percentage) / 100;
    }
}

class Manager extends Employee {
    private String depart;

    public Manager(String name, int empid, double salary, String depart) {
        super(name, empid, salary);
        this.depart = depart;
    }

    public String getdepart() {
        return depart;
    }
}

public class code4 {
    public static void main(String[] args) {
        Employee emp = new Employee("Jayant", 500120083, 15600);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: $" + emp.getSalary());

        emp.increaseSalary(10);
        System.out.println("New Salary after increase: $" + emp.getSalary());

        Manager manager = new Manager("Jayesh Patni", 50012236, 17300, "HR");

        System.out.println("\nManager Name: " + manager.getName());
        System.out.println("Manager Salary: $" + manager.getSalary());
        System.out.println("Manager department: " + manager.getdepart());

        manager.increaseSalary(15);
        System.out.println("New Salary after increase: $" + manager.getSalary());
        System.out.println("Jayant dev SAP: 500120083");
    }
}
