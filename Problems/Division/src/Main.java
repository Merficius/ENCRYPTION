import java.util.Scanner;

public class Main {

    public static double divide(long a, long b) {
        return (double) a / b;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}