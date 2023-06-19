package Array;



public class EvenElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Elements of array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

            for (int i = 1; i < a.length; i += 2){
                System.out.println("element at even position  :" + a[i]);
            }
        }
    }




