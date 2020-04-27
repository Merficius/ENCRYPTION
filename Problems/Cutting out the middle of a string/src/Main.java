// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String newInput = "";
        if (input.length() % 2 == 0) {
            newInput += input.substring(0, input.length() / 2 - 1);
        } else {
            newInput += input.substring(0, input.length() / 2);
        }
        newInput += input.substring(input.length() / 2 + 1, input.length());
        System.out.println(newInput);
    }
}