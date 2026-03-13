package module6;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {40,64,35,67,22};
        int largest = 0, secondlargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        System.out.println("Second lasrgest Element is : " + secondlargest);
    }
}