// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int left = 0;
        int right = string.length() - 1;
        boolean flag = true;

        for (int i = 0; i < string.length() / 2 + 1; i++) {
            if (string.charAt(left++) == string.charAt(right--)) {
                continue;
            } else {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
