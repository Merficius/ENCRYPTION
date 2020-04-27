// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int upperLimit = scanner.nextInt();
        int currentBridge;

        for (int i = 0; i < upperLimit; i++) {
            currentBridge = scanner.nextInt();
            if (busHeight >= currentBridge) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            } else if (i == upperLimit - 1) {
                System.out.println("Will not crash");
            }
        }
    }
}