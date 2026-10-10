
class EmployeeStaticDemo {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    EmployeeStaticDemo(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        EmployeeStaticDemo emp1 = new EmployeeStaticDemo("Divya", 65000);
        EmployeeStaticDemo emp2 = new EmployeeStaticDemo("Arjun", 40000);
        EmployeeStaticDemo emp3 = new EmployeeStaticDemo("Priya", 55000);
        EmployeeStaticDemo.printCompanyInfo();
    }
}
