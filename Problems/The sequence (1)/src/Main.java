// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int counter = 0;
        outerloop:
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                counter++;
                if (counter == limit) {
                    break outerloop;
                }
            }
        }
    }
}