package searching;

public class LinearSearchExm {
    public static void main(String[] args) {
        int a[]= new int[]{1,2,4,5,6,7,8,9,10,11,12,13,17,45};
        int srch= 13;
        for(int i=0;i<a.length;i++){
            System.out.println("Number of Comparison " + (i+1));
            if(a[i]==srch){
                System.out.println("record found at position " + (i+1));
                break;

            }
        }
    }
}
