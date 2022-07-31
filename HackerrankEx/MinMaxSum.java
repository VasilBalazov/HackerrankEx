import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MinMax {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long arrAll = 0;
        for (int i = 0; i < arr.size(); i++) {
            arrAll += arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            long number = arrAll - arr.get(i);
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }
        System.out.println(min + " " + max);
    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MinMax.miniMaxSum(arr);

        bufferedReader.close();
    }
}
