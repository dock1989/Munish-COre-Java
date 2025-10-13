package inheritance;


class GrandfatherExm{
    public void dd(){
        System.out.println("This is from gradfather class");
    }
    public void ee(){
        System.out.println("This is different method");
    }
}

class ParentExm extends GrandfatherExm{
   @Override
    public void dd(){
       super.dd();
        System.out.println("This is from parent class");
    }
}

public class ChildExm extends ParentExm {
    @Override
    public void dd() {
        super.dd();
        System.out.println("This is from child class");
    }

    public static void main(String[] args) {
        ChildExm childExm = new ChildExm();
        childExm.dd();
        childExm.ee();

    }
}


