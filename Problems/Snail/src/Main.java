// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int feetsHeight = scanner.nextInt();
        int feetsUp = scanner.nextInt();
        int feetsDown = scanner.nextInt();
        int days = (feetsHeight - feetsDown) / (feetsUp - feetsDown) - (((feetsHeight - feetsDown) % (feetsUp - feetsDown) + 2) / ((feetsHeight - feetsDown) % (feetsUp - feetsDown) + 1) - 2);
        System.out.println(days);
    }
}