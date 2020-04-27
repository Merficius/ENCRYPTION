// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLimit = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        int currentNumber;

        for (int i = 0; i < upperLimit; i++) {
            currentNumber = scanner.nextInt();
            if (currentNumber == -1) {
                smaller++;
            } else if (currentNumber == 0) {
                perfect++;
            } else {
                larger++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}