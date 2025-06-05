package conditional;

public class AdditionProgram {
    public static void main(String[] args) {
        int sum=0;
//        for(int i=1;i<=10;i++){
//            sum +=i;
//        }
//        System.out.println(sum);

//        int i=1;
//        while(i<=10){
//            sum +=i;
//            i++;
//        }
//        System.out.println(sum);


        int i=1;
        do{
            sum +=i;
            i++;
        }
        while(i<=10);
        System.out.println(sum);
    }
}
