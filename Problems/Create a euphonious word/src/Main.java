import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //kwawoaowwww
        String vowels = "aeiouy";
        String consonants = "bcdfghjklmnpqrstvwxz";
        int numberVowels = 0;
        int numberConsonants = 0;
        int total = 0;

        for (int i = 1; i < input.length(); i++) {

            if (vowels.indexOf(input.charAt(i - 1)) != -1) { //Vowel.
                numberVowels++;
                numberConsonants = 0;

                if (numberVowels % 2 == 0 && vowels.indexOf(input.charAt(i)) != -1) {//Three vocals.
                    total++;
                }

            } else if (consonants.indexOf(input.charAt(i - 1)) != -1) { //Consonant.
                numberConsonants++;
                numberVowels = 0;
                if (numberConsonants % 2 == 0 && consonants.indexOf(input.charAt(i)) != -1) {//Three consonants.
                    total++;
                }

            }

        }

        System.out.println(total);
    }
}
