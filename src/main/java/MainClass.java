import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


class Employee{
    private int id;
    private String name;
    private double  salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
       if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
}

public class MainClass{
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee(1,"Ajay",5600.00));
        employeeSet.add(new Employee(2,"Ajay",5600.00));
        employeeSet.add(new Employee(3,"Ajay",5600.00));
        employeeSet.add(new Employee(4,"Ajay",5600.00));
        employeeSet.add(new Employee(5,"Ajay",5600.00));
        employeeSet.add(new Employee(5,"Ajay",5600.00));

        System.out.println(employeeSet);


    }
}
