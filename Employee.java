public class Employee extends Person1 {
    private String employeeID;
    private double salary;
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public void displayEmployeeInfo() {
        super.displayPersonInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: Rs." + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Tim", 28, "1222", 75000.0);
        emp.displayEmployeeInfo();
    }
}