// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstHour = scanner.nextInt();
        int firstMinute = scanner.nextInt();
        int firstSecond = scanner.nextInt();
        int secondHour = scanner.nextInt();
        int secondMinute = scanner.nextInt();
        int secondSecond = scanner.nextInt();
        int firstTotalSeconds;
        int secondTotalSeconds;

        firstHour *= 3600;
        firstMinute *= 60;
        secondHour *= 3600;
        secondMinute *= 60;

        firstTotalSeconds = firstHour + firstMinute + firstSecond;
        secondTotalSeconds = secondHour + secondMinute + secondSecond;

        System.out.println(secondTotalSeconds - firstTotalSeconds);

    }
}