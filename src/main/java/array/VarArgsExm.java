package array;

public class VarArgsExm {

    public static void main(String[] args) {
        VarArgsExm varArgsExm = new VarArgsExm();
        System.out.println(varArgsExm.sum("Ajay",'t',3,4,3,2,3,4,4,3,3,2,3));
    }

    public int sum(String name,int... num){
        int sum=0;
        for(int a:num){
            sum+=a;
        }
        return sum;
    }
}
