package inheritance;

public class MainEmployeeClass {
    public static void main(String[] args) {
        Employee employee = new Executive();  // polymorphism
        System.out.println(employee.empDetails("Ajay"));
    }
}
