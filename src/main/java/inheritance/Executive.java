package inheritance;

public class Executive extends Employee{
    @Override
    public String empDetails(String name) {
        return "Executive " + name;
    }
}
