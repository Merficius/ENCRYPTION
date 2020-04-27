// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber;
        int sum = 0;

        do {
            currentNumber = scanner.nextInt();
            sum += currentNumber;
        } while (sum < 1000 && currentNumber != 0);
        if (sum >= 1000) {
            sum -= 1000;
        }
        System.out.println(sum);
    }
}