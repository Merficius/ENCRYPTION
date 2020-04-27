// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String[] urlDivided = url.split("\\?");
        urlDivided = urlDivided[urlDivided.length - 1].split("&");
        String[] split2;
        boolean pass = false;
        String password = "";

        for (String a : urlDivided) {
            split2 = a.split("=");
            if (split2.length == 1) {
                System.out.println(split2[0] + " : not found");
            } else {
                System.out.println(split2[0] + " : " + split2[1]);
                if (split2[0].equals("pass")) {
                    pass = true;
                    password = split2[1];
                }
            }
        }

        if (pass) {
            System.out.println("password : " + password);
        }
    }
}