// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print(number % 10);
        number /= 10;
        System.out.print(number % 10);
        number /= 10;
        System.out.println(number);
    }
}