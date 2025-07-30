package recurssion;

public class RecurrsionExm1 {
    public static void main(String[] args) {
        RecurrsionExm1 recurrsionExm1 = new RecurrsionExm1();
        System.out.println(recurrsionExm1.factorial(5));
    }

    /**
     * when a function calls itself then it is a recurssion
     * @param num
     * @return
     */
    private int factorial(int num){
        if(num==1)
            return 1;
        return num * factorial(num-1);
    }



}
