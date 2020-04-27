// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String newInput = "";

        for (char ch : input.toCharArray()) {
            newInput += ch;
            newInput += ch;
        }
        System.out.println(newInput);
    }
}