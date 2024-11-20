package inheritance;

/**
 * <b>Only one</b> abstract class name can be given after extends
 * and <b>multiple interface names</b> can be given after implements keyword seperated by
 * comma
 */
public class ChildClass extends AbstractExm implements InterfaceExm{
    @Override
    public void aa() {
        System.out.println("This is from child class");
    }

    @Override
    public void cc() {
        System.out.println("This is from child class");
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.bb();
        childClass.aa();
        childClass.cc();
        childClass.dd();
        childClass.ff();
    }

    @Override
    public void dd() {
        System.out.println("Interface method from child class");
    }

    @Override
    public void ee() {
        System.out.println("Interface method from child class");
    }
}
