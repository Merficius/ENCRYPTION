// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = num % 10;
        num /= 10;
        int b = num % 10;
        num /= 10;
        int c = num % 10;
        num /= 10;
        int d = num % 10;
        if (a == d && b == c) {
            System.out.println(1);
        } else {
            System.out.println(42);
        }
    }
}