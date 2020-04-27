// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLimit = scanner.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        int currentNumber;

        for (int i = 0; i < upperLimit; i++) {
            currentNumber = scanner.nextInt();
            if (currentNumber == 2) {
                d++;
            } else if (currentNumber == 3) {
                c++;
            } else if (currentNumber == 4) {
                b++;
            } else if (currentNumber == 5) {
                a++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}