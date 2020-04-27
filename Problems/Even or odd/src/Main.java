// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber;

        while (true) {
            currentNumber = scanner.nextInt();
            if (currentNumber == 0) {
                break;
            } else if (currentNumber % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}