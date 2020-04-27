// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int food = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotel = scanner.nextInt();

        System.out.println(days*food + 2 * flight + hotel * (days - 1));
    }
}