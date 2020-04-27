/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int currentNumber = Integer.parseInt(args[1]);
        int result = currentNumber;

        if (args.length == 2) {
            System.out.println(currentNumber);
        } else if ("MAX".equals(operator)) {
            for (int i = 2; i < args.length; i++) {
                currentNumber = Integer.parseInt(args[i]);
                if (currentNumber > result) {
                    result = currentNumber;
                }
            }

            System.out.println(result);
        } else if ("MIN".equals(operator)) {
            for (int i = 2; i < args.length; i++) {
                currentNumber = Integer.parseInt(args[i]);
                if (currentNumber < result) {
                    result = currentNumber;
                }
            }

            System.out.println(result);
        } else {
            for (int i = 2; i < args.length; i++) {
                currentNumber = Integer.parseInt(args[i]);
                result += currentNumber;
            }

            System.out.println(result);
        }
    }
}