// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        input = input.toLowerCase();
        System.out.println(input.charAt(0) == 'j');
    }
}