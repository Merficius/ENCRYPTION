// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = string.toLowerCase();
        System.out.println(string.indexOf("the"));

    }
}