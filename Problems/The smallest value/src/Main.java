// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        int i = 1;
        while (n <= m) {
            n *= i;
            i++;
        }
        System.out.println(i - 1);
    }
}