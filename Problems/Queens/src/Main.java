// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int bPositive = y1 - x1;
        int bNegative = y2 + 1;

        boolean sameRow = y1 == y2;
        boolean sameColumn = x1 == x2;
        boolean sameDiagonalPositive = x2 + bPositive == y2;
        boolean sameDiagonalNegative = -x2 + bNegative == y2;

        if (sameRow || sameColumn || sameDiagonalPositive || sameDiagonalNegative) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

