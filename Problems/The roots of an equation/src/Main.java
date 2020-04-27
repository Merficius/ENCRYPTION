// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        long result = 0;
        int roots = 0;

        for (int i = 0; i < 1000 && roots < 3; i++) {
            result = a * i * i * i + b * i * i + c * i + d;
            if (result == 0) {
                System.out.println(i);
                roots++;
            }
        }
    }
}