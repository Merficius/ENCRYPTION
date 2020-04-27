// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int lowLimit = scanner.nextInt();
        int topLimit = scanner.nextInt();

        System.out.println(input.substring(lowLimit, topLimit+1));

    }
}