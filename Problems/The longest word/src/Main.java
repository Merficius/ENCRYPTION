// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] split = string.split(" ");
        String result = "";

        for (String a: split) {
            if (a.length() > result.length()) {
                result = a;
            }
        }
        System.out.println(result);
    }
}