package inheritance;

public class DirectorClass extends Employee{
    @Override
    public String empDetails(String name) {
        return "Director " + name;
    }
}
