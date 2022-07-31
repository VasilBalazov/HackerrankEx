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

class ResultTT {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
       double positive = 0;
       double negative = 0;
       double zeros = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0){
                zeros++;
            } else if (arr.get(i) > 0) {
                positive++;
            }else {
                negative++;
            }
        }
        int size = arr.size();
        double positiveRatio =positive / size;
        double negativeRatio = negative / size;
        double zerosRatio = zeros / size;
        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zerosRatio);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        ResultTT.plusMinus(arr);

        bufferedReader.close();
    }
}
