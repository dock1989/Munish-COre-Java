package inheritance;

public class ChildClass2 extends AbstractExm{

    @Override
    public void aa() {
        System.out.println("This is from child2 class");
    }

    @Override
    public void cc() {
        System.out.println("This is from child2 class");
    }

    @Override
    public void dd() {
        
    }

    public static void main(String[] args) {
        ChildClass2 childClass2 = new ChildClass2();
        childClass2.aa();
        childClass2.bb();
        childClass2.cc();
    }
}
