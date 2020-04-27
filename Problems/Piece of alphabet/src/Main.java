// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        boolean flag = true;

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i - 1) + 1 == string.charAt(i)) {
                continue;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}