package kevin.demo;
public class EmployeeTest {
    public int salary;
    public String name;
    public EmployeeTest(String ename) {
        name = ename;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void printff() {
        System.out.println("员工1：" + name);
        System.out.println("薪水：" + salary);
    }
        public static void main(String[] args) {
            EmployeeTest employeeTest1 = new EmployeeTest("Roubin");
            employeeTest1.setSalary(1000);
            employeeTest1.printff();

        }

}
