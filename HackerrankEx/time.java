import java.io.*;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String hours = s.substring(0, 2);
        String minutes = s.substring(3, 5);
        String seconds = s.substring(6, 8);
        String amPM = s.substring(8, 10);
        if (amPM.equals("AM") && hours.equals("12")) {
            return "00:" + minutes + ":" + seconds;
        }else if (amPM.equals("AM")){
            return hours + ":" + minutes + ":" + seconds;
        }else if (amPM.equals("PM") && hours.equals("12")){
            return hours + ":" + minutes + ":" + seconds;
        }else if (amPM.equals("PM")){
            int hour = Integer.parseInt(hours) + 12;
            return hour + ":" + minutes + ":" + seconds;
        }
        return hours;
    }

}

public class time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = Result.timeConversion(s);
        System.out.println(result);
    }
}
