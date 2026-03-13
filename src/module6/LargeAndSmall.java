package module6;

public class LargeAndSmall {
    public static void main(String[] args) {
        int[] arr = {20,45,62,22,74,81};
        int min = 100;
        int max = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
            System.out.println(max);
            System.out.println(min);
    }
}
