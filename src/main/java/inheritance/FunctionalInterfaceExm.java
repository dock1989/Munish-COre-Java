package inheritance;

public interface FunctionalInterfaceExm {
    public int sum(int a,int b);

    default void dd(){
        System.out.println("This is from default Interface");
    }
}
