// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLimit = scanner.nextInt();
        int sum = 0;
        int currentNumber;
        int result = 0;

        for (int i = 0; i < upperLimit; i++) {
            currentNumber = scanner.nextInt();
            if (currentNumber % 4 == 0 && currentNumber >= result) {
                result = currentNumber;
            }
        }
        System.out.println(result);
    }
}