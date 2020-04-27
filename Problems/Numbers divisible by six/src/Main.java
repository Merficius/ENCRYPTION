// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int currentNumber;
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            currentNumber = scanner.nextInt();
            if (currentNumber % 6 == 0) {
                sum += currentNumber;
            }
        }
        System.out.println(sum);
    }
}