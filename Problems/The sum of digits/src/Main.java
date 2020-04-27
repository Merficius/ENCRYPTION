// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number1 = number%10;
        number /= 10;
        int number2 = number%10;
        number /= 10;
        int number3 = number%10;
        System.out.println(number1 + number2 + number3);
    }
}