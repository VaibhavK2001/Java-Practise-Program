public class BinarySearch {
    

    public static int binarySearch(int arr[],int l, int r, int x){
        l = 0;
        int mid = 0;
        while (l<=r){
            mid = (l+r)/2;
            if (arr[mid] == x) {
                return mid;
            }
            else if (arr[mid] < x) {
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {3,21, 31, 41,55,59,78};
        int result = binarySearch(arr, 0, (arr.length)-1, 32);
        if (result == -1) {
            System.out.println("Element not found in array");
        }else{
            System.out.println("Element is at "+result+" position");
        }
    }
}
