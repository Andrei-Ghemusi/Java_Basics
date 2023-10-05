package OOP;

public class Employee {
    // Class Employee
    //Attributes: name, surname, salary
    //Constructor for all attributes
    //Methods:
    //● describe()
    //● full_name()
    //● monthly_salary()
    //● annual_salary()
    //● increase_salary(percent)

    private String name;
    private String surname;
    private Integer salary;

    public Employee(String name, String surname, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void describe() {
        System.out.printf("The employee's full name is \"%s %s\" and their salary is %d%n", name, surname, salary);
    }

    public String fullName() {
        return this.name + " " + this.surname;
    }

    public int monthlySalary() {
        return this.salary;
    }

    public int yearlySalary() {
        return 12*this.monthlySalary();
    }

    public double increaseSalary(double percentage) {
        double raise = (double) this.salary * (percentage/100);
        return (double) this.salary + raise;
    }

}
