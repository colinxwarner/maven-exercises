import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringExercise {

    public static Object isNumber(String input){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        String userInfo = scan.nextLine();
        if(StringUtils.isNumeric(userInfo)){
            System.out.println("Your response is a number");
        } else{
            System.out.println("Your response is not a number");
        }
        return null;
    }
    public static String flipCase(String input) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your data");
        String userInfo = scan.nextLine();
        return StringUtils.swapCase(userInfo);
    }
    public static String reverseCase(String input){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your data.");
        String userInfo = scan.nextLine();
        return StringUtils.reverse(userInfo);
    }
    public static void main(String[] args) {
        isNumber("");
        System.out.println(reverseCase(""));
        System.out.println(flipCase(""));

    }
}
