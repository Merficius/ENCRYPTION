// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = scanner.nextInt();
        int nextNumber;
        boolean ascending = true;
        boolean descending = true;

        do {
            nextNumber = scanner.nextInt();
            if (nextNumber != 0) {
                if (currentNumber >= nextNumber && descending) {
                    currentNumber = nextNumber;
                    continue;
                } else {
                    descending = false;
                }
                if (currentNumber <= nextNumber && ascending) {
                    currentNumber = nextNumber;
                    continue;
                } else {
                    ascending = false;
                }
            }
        } while (nextNumber != 0 && (ascending || descending));
        System.out.println(ascending || descending);
    }
}