// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        boolean n1n2 = n1 + n2 == 20;
        boolean n1n3 = n1 + n3 == 20;
        boolean n2n3 = n2 + n3 == 20;

        System.out.println(n1n2 || n1n3 || n2n3);
    }
}