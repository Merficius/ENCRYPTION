// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerLimit = scanner.nextInt();
        int upperLimit = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 0;
        int multiplesPre;

        multiplesPre = (lowerLimit - 1) / n;

        result += upperLimit / n - multiplesPre;
        System.out.println(result);
    }
}