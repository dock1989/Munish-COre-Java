package searching;

//public class BinarySearch {
//    public static void main(String[] args) {
//        int a[]= new int[]{1,2,4,5,6,7,8,9,10,11,12,13,17,45};
//        int srch= 13;
//        int midElement = a.length/2; // 14/2 =7
//        if(a[midElement-1] <= srch){
//
//        }
//        else {
//
//        }
//
//    }
//}


public class BinarySearch {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,4,5,6,7,8,9,10,11,12,13,17,45};
        int pass = 0;
        int srch = 13;
        int low = 0;
        int high = a.length - 1;
        boolean found = false;

        while (low <= high) {
            System.out.println("The number of comparison is " + (pass++));
            int mid = (low + high) / 2;

            if (a[mid] == srch) {
                System.out.println("Element found at position: " + (mid+1));
                found = true;
                break;
            } else if (a[mid] < srch) {
                low = mid + 1;  // search in right half
            } else {
                high = mid - 1; // search in left half
            }
        }

        if (!found) {
            System.out.println("Element not found!");
        }
    }
}

