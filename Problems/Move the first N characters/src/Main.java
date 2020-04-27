// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int displacement = scanner.nextInt();
        String newString = "";
        if (displacement > string.length()) {
            System.out.println(string);
        } else {
            newString = string.substring(displacement, string.length());
            newString += string.substring(0, displacement);
            System.out.println(newString);
        }


    }
}