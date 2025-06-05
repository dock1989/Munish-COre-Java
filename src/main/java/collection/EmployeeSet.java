package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EmployeeSet {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee(1,"Ajay","Delhi"));
        employeeSet.add(new Employee(1,"Ajay","Delhi"));
        employeeSet.add(new Employee(1,"Ajay","Delhi"));
        employeeSet.add(new Employee(1,"Ajay","Delhi"));
        System.out.println(employeeSet.size());
    }
}

class Employee{
    private int id;
    private String name;
    private String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
       if(this == o) return true;
       if(o== null || getClass() != o.getClass()) return true;
       Employee employee = (Employee) o;
       return id == employee.getId() && name == employee.name && address == employee.getAddress();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}
