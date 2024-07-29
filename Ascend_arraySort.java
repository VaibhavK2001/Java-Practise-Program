public class Ascend_arraySort {
    
    public static void main(String[] args) {
        
        int [] arr = {2,11,4,5,8,23,10};

        System.out.println("Original Array");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Array Sorted in Asceding order");

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
