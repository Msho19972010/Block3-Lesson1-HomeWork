import java.util.Random;

public class Generate {

    public static void generate(int[] arr, int arrLength) {

        Random random = new Random();

        for(int i = 0; i < arrLength; i++) {
            arr[i] = random.nextInt(10);
        }
    }
}
