package inheritance;

public class ParentClass {
    int a,b,c;

    public ParentClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public ParentClass(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void dd(){
        System.out.println("The value for a from child class " + a);
        System.out.println("The value for b from child class " + b);
    }
}
