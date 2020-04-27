// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber;
        int largestNumber = 0;

        do {
            currentNumber = scanner.nextInt();
            if (currentNumber > largestNumber) {
                largestNumber = currentNumber;
            }
        } while (currentNumber != 0);
        System.out.println(largestNumber);
    }
}