package module7;

public class Selection {
    static void SelectionSort(int[] arr){
        for (int i=0; i< arr.length-1; i++){
            int min=i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={34,56,78,66,90};
        SelectionSort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
