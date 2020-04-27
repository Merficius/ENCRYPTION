// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int top = scanner.nextInt();
        int square = 1;
        int counter = 1;

        while (square <= top) {
            System.out.println(square);
            counter++;
            square = counter * counter;
        }
    }
}