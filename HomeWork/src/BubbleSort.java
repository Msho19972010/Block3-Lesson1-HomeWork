public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j =1; j < arr.length; j++) {
                if(arr[j - 1] < j) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
