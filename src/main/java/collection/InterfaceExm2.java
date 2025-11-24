package collection;

public interface InterfaceExm2 {
    public void cc();
    public void dd();
    default  void pp(){
        System.out.println("This is from default method");
    }
}
