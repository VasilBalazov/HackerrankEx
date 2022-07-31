import java.util.Scanner;

public class CountingBits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String binary = Long.toBinaryString(n);
        System.out.println(binary);
        int counter = 0;
        for (int i = binary.length()-1; i >= 0; i--) {
            if (binary.charAt(i) == '1'){
                System.out.println(i+1);
                counter++;
            }

        }
        System.out.println(counter);
    }
}
