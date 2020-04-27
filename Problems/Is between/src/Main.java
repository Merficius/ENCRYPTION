// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        boolean greaterThan = n1 >= n2 || n1 >= n3;
        boolean lowerThan = n1 <= n2 || n1 <= n3;

        System.out.println(greaterThan && lowerThan);
    }
}