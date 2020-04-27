// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerLimit = scanner.nextInt();
        int upperLimit = scanner.nextInt();
        long mult = 1;

        for (int i = lowerLimit; i < upperLimit; i++) {
            mult *= i;
        }
        System.out.println(mult);
    }
}