import java.lang.reflect.Array;

public class ArrayRotation {
    public static void main(String[] args) {

        int[] numbers = new int[] {1,2,3,4,5};
        int[] out = new int[5];
        int startIndex = 3;
        int k =0;
        for (int i = startIndex; i < numbers.length; i++) {
            out[k] = numbers[i];
            k++;
        }
        for (int i = 0; i < startIndex; i++) {
            out[k] = numbers[i];
            k++;
        }
        for (int j : out) {
            System.out.print(j + " ");
        }

    }
}
