package module7;

public class bubble {
        static void BubbleSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {7,9,8,5,4,6};
            BubbleSort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");

            }
        }
    }



