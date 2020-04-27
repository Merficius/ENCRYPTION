import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        Time noon = new Time();
        noon.hour = 12;
        noon.minute = 0;
        noon.second = 0;

        return noon;
    }

    public static Time midnight() {
        Time midnight = new Time();
        midnight.hour = 0;
        midnight.minute = 0;
        midnight.second = 0;

        return midnight;
    }

    public static Time ofSeconds(long seconds) {
        Time ofSeconds = new Time();
        ofSeconds.hour = (int) ((seconds / 3600) % 24);
        ofSeconds.minute = (int) ((seconds / 60) % 60);
        ofSeconds.second = (int) (seconds % 60);

        return ofSeconds;
    }

    public static Time of(int hour, int minute, int second) {
        Time of = new Time();

        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            of.hour = hour;
            of.minute = minute;
            of.second = second;

            return of;
        } else {
            return null;
        }
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}
