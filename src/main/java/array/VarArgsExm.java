package array;

public class VarArgsExm {

    public static void main(String[] args) {
        VarArgsExm varArgsExm = new VarArgsExm();
        System.out.println(varArgsExm.sum("Ajay",'t',3,4,3,2,3,4,4,3,3,2,3,3,2,2,3,4));
    }

    public int sum(String name,char c,int... num){
        int sum=0;
        for(int a:num){   // enhanced for loop
            sum+=a;
        }
        return sum;
    }
}
