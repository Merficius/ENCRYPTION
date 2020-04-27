// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int top = scanner.nextInt();
        int currentNumber;
        int topNumber = 0;
        int i = 0;
        while (i < top) {
            currentNumber = scanner.nextInt();
            if (currentNumber > topNumber && currentNumber % 4 == 0) {
                topNumber = currentNumber;
            }
            i++;
        }
        System.out.println(topNumber);
    }
}