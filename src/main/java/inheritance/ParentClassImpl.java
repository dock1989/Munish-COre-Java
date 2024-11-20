package inheritance;

public class ParentClassImpl extends ParentClass{
    public ParentClassImpl(int a, int b) {
        super(a, b);  // contructor calling of parent class
        super.dd();  // parent method calling
    }

    public static void main(String[] args) {
        ParentClassImpl parentClassImpl = new ParentClassImpl(3,4);

    }
}
