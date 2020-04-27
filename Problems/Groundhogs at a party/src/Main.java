// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean success = !isWeekend && (cups >= 10 && cups <= 20);
        boolean succesWeekend = isWeekend && (cups >= 15 && cups <= 25);

        System.out.println(success || succesWeekend);
    }
}