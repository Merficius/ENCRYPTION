// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        first = first.trim();
        first = first.replace(" ", "");
        second = second.trim();
        second = second.replace(" ", "");

        System.out.println(first.equals(second));

    }
}