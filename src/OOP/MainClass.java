package OOP;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("\nEx_1");
        Account account = new Account(123456789, "John Doe", 1000.0);

        account.accountDetails();
        account.displayBalance();
        account.deposit(500.0);
        account.withdraw(300.0);
        account.displayBalance();


        System.out.println("\nEx_2");
        Car car = new Car("1310", 180);

        car.describe();
        car.changeRegister();
        car.paintCar("blue");
        car.accelerateSpeed(100);
        car.brake();
        car.describe();


        System.out.println("\nEx_3");
        Circle circle = new Circle(12, "red");

        circle.describeCircle();
        circle.diameter();
        circle.area();
        circle.circumference();


        System.out.println("\nEx_4");
        Employee employee = new Employee("Jerry", "Robert", 6000);

        employee.describe();
        employee.fullName();
        employee.monthlySalary();
        employee.increaseSalary(15);
        employee.yearlySalary();


        System.out.println("\nEx_5");
        Invoice invoice = new Invoice(3, "Ariel", 10, 30);

        invoice.changeQuantity(15);
        invoice.changePrice(35);
        invoice.changeProductName("Dero");
        invoice.generateInvoice();


        System.out.println("\nEx_6");
        Rectangle rectangle = new Rectangle(12, 5, "red");

        rectangle.describe();
        rectangle.area();
        rectangle.perimeter();
        rectangle.change_color("blue");
        rectangle.describe();


        System.out.println("\nEx_7");
        TodoList todoList = new TodoList();

        todoList.addTask("Task 1", "Description 1");
        todoList.addTask("Task 2", "Description 2");

        todoList.showTodoList();

        todoList.showAdditionalDetails("Task 1");
        todoList.showAdditionalDetails("Task 3"); // Not in the list

        todoList.completeTask("Task 1");

        todoList.showTodoList();

    }
}
