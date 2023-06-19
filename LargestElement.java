package Array;

public class LargestElement {
    public static void main(String[] args) {
        int[] a = {1,5,6,7,2,3,4};
        int l = a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]> l){
                l = a[i];
            }
        }
        System.out.println("the largest element in the array is "+l);
    }
}
