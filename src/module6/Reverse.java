package module6;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {4,5,7,2,7,8};
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}

