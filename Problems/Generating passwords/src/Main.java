// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uppercase = scanner.nextInt();
        int lowercase = scanner.nextInt();
        int digits = scanner.nextInt();
        int symbols = scanner.nextInt();
        int control = 0;
        String password = "";
        int saveNumber = 0;


        //uppercase
        for (int i = 0; i < uppercase; i++) {
            password = password + (char) ('A' + control++);
            if ((i + 1) % 26 == 0) {
                control = 0;
            }
            symbols--;
        }
        control = 0;

        //lowercase
        for (int i = 0; i < lowercase; i++) {
            password = password + (char) ('a' + control++);
            if ((i + 1) % 26 == 0) {
                control = 0;
            }
            symbols--;
        }
        control = 0;

        //digits
        for (int i = 0; i < digits; i++) {
            password = password + control++;
            if ((i + 1) % 10 == 0) {
                control = 0;
            }
            symbols--;
            saveNumber = control;
        }
        control = 0;

        //symbols
        for (int i = 0; i < symbols; i++) {
            if ((i + 1) % 10 == 0 || saveNumber % 10 == 0) {
                saveNumber = 0;
            }
            password = password + saveNumber++;
        }
        control = 0;
        System.out.println(password);
    }
}