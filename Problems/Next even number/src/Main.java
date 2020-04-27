// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        number += 1;
        number += number % 2;
        System.out.println(number);
    }
}