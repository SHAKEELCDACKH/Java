public class Employee {
    String name;
    int id;

    public Employee(String employeeName, int employeeId) {
        name = employeeName;
        id = employeeId;
    }

    public void calculateSalary(double hourlyRate, int hoursWorked) {
        double salary = hourlyRate * hoursWorked;
        System.out.println(name + "'s salary: $" + salary);
    }

    public void calculateSalary(double fixedSalary) {
        System.out.println(name + "'s salary: $" + fixedSalary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Bob", 12345);
        emp1.calculateSalary(25.0, 40); 

        Employee emp2 = new Employee("Sarah", 54321);
        emp2.calculateSalary(50000.0);
    }
}
