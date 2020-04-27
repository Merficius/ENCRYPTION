// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int index = 0;
        int counter = 0;
        int sum = 0;
        string = string.toLowerCase();

        while (index < string.length()) {
            if (string.indexOf("c", index) != -1) {
                index = string.indexOf("c", index) + 1;
                counter++;
            } else {
                break;
            }
        }
        sum += counter;

        index = 0;
        counter = 0;
        while (index < string.length()) {
            if (string.indexOf("g", index) != -1) {
                index = string.indexOf("g", index) + 1;
                counter++;
            } else {
                break;
            }
        }
        sum += counter;
        System.out.println((double) sum / string.length() * 100);

    }
}
