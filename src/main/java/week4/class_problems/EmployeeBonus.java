
class EmployeeBonus {
    String empId; double salary;
    EmployeeBonus(String empId, double salary) { this.empId = empId; this.salary = salary; }
    void raiseSalary(double salary) { this.salary += salary; }
    public static void main(String[] args) {
        String[] ids = {"E-101", "E-102", "E-103", "E-104"}; double[] salaries = {40000, 55000, 62000, 48000};
        EmployeeBonus[] employees = new EmployeeBonus[ids.length];
        for (int i = 0; i < employees.length; i++) employees[i] = new EmployeeBonus(ids[i], salaries[i]);
        for (int i = 0; i < employees.length; i++) { employees[i].raiseSalary(5000); System.out.println(employees[i].empId + " | Final Salary: Rs " + employees[i].salary); }
    }
}
