import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input= scan.nextLine();

//        if (isBalanced(input)){
//            System.out.println("Balanced");
//        }else {
//            System.out.println("Not balanced");
//        }
//        if (isBalancedAdvanced(input)){
//            System.out.println("Balanced");
//        }else {
//            System.out.println("Not balanced");
//        }
//        if (isBalancedAdvanced2(input)){
//            System.out.println("Balanced");
//        }else {
//            System.out.println("Not balanced");
//        }
                if (isBalancedAdvanced4(input)){
            System.out.println("Balanced");
        }else {
            System.out.println("Not balanced");
        }
    }

    private static boolean isBalancedAdvanced4(String input) {
        Stack brackets = new Stack();
        for (int i = 0; i < input.length(); i++) {
            if (brackets.empty()){
                brackets.push(input.charAt(i));
            }else if ((brackets.peek().equals('[') && input.charAt(i) == ']') ||
            (brackets.peek().equals('(') && input.charAt(i) == ')')||
                    (brackets.peek().equals('{') && input.charAt(i) == '}')){
                brackets.pop();
            }else {
                brackets.push(input.charAt(i));
            }
        }
        return brackets.empty();
    }



    private static boolean isBalancedAdvanced(String input) {

        Stack brackets = new Stack();
        for (int i = 0; i < input.length(); i++) {
//            brackets.push(input.charAt(i));
            if (brackets.empty()){
                brackets.push(input.charAt(i));
            }else if (brackets.peek().equals('[') && input.charAt(i) == ']'){
                brackets.pop();
            }else {
                brackets.push(input.charAt(i));
            }

        }
        return brackets.empty();
    }

    private static Boolean isBalanced(String input) {
        int countLeftBracket = 0;
        int countRightBracket = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '['){
                countLeftBracket++;
            }else if(input.charAt(i) == ']'){
                countRightBracket++;
            }
        }
        return countLeftBracket == countRightBracket;
    }
}
