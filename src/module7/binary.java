package module7;

public class binary {
    static int BinarySearch(int key, int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }return -1;
    }


    public static void main (String[] args){
        int[] arr = {8,5,3,8,5,6,9,3};
        int key = 7;
        System.out.println(BinarySearch(key, arr));
    }
}
