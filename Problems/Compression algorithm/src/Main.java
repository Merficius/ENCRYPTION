// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dna = scanner.nextLine();
        int sum = 1;
        String newDna = "";
        char[] charArray = dna.toCharArray();

        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i - 1]) {
                sum++;
            } else {
                newDna = newDna + charArray[i - 1] + sum;
                sum = 1;
            }
        }
        newDna = newDna + charArray[charArray.length - 1] + sum;
        System.out.println(newDna);
    }
}