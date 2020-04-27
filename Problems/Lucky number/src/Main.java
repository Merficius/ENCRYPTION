import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();
        int sum1 = 0;
        int sum2 = 0;
        int counter = 0;

        for (char ch : ticket.toCharArray()) {
            if (counter < ticket.length() / 2) {
                sum1 += Character.getNumericValue(ch);
            } else {
                sum2 += Character.getNumericValue(ch);
            }
            counter++;
        }
        if (sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}