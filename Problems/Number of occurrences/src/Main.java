// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String substring = scanner.nextLine();
        int index = 0;
        int counter = 0;

        while (index < string.length()) {
            if (string.indexOf(substring, index) != -1) {
                index = string.indexOf(substring, index) + 1;
                counter++;
            } else {
                break;
            }
        }
        System.out.println(counter);

    }
}