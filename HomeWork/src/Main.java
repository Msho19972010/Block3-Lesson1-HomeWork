import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = new int[arraySize];
        Generate.generate(array, arraySize);
        long startTime = System.currentTimeMillis();
        Arrays.sort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("Arrays.sort time = " + (endTime - startTime));

        Generate.generate(array, arraySize);
        startTime = System.currentTimeMillis();
        BubbleSort.bubbleSort(array);
        endTime = System.currentTimeMillis();
        System.out.println("Bubble.sort time = " + (endTime - startTime));

        Generate.generate(array, arraySize);
        startTime = System.currentTimeMillis();
        InsertSort.insertSort(array);
        endTime = System.currentTimeMillis();
        System.out.println("Insert.sort time = " + (endTime - startTime));


        Generate.generate(array, arraySize);
        startTime = System.currentTimeMillis();
        SelectSort.selectSortAscending(array);
        endTime = System.currentTimeMillis();
        System.out.println("Select.sort time = " + (endTime - startTime));
    }
}
