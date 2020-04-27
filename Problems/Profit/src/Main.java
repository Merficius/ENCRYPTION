// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int years = 0;
        double quantity = (double) m;
        double increment = (double) p / 100;
        double maximum = (double) k;

        while (quantity < maximum) {
            years++;
            quantity += quantity * increment;
        }

        System.out.println(years);
    }
}