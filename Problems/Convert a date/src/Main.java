// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8, 10);

        System.out.println(month + "/" + day + "/" + year);
    }
}
