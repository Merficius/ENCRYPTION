// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String o = scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        String c = scanner.nextLine();

        System.out.print("The form for " + o + " is completed.");
        System.out.print(" We will contact you if we need a chef that cooks " + c + " dishes.");
    }
}