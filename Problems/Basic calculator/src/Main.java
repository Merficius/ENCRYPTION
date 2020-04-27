class Problem {

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[1]);
        int number2 = Integer.parseInt(args[2]);

        if ("+".equals(args[0])) {
            System.out.println(number1 + number2);
        } else if ("-".equals(args[0])) {
            System.out.println(number1 - number2);
        } else if ("*".equals(args[0])) {
            System.out.println(number1 * number2);
        } else {
            System.out.println("Unknown operator");
        }

    }

}