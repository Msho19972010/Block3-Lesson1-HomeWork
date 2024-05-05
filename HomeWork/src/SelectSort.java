public class SelectSort {

    public static void selectSortAscending(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minElemIndex = 1;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[minElemIndex] > arr[j]) {
                    minElemIndex = j;
                }
            }

            if(minElemIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElemIndex];
                arr[minElemIndex] = temp;
            }
        }
    }
}
