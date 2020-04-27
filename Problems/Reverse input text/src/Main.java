import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char[] characters = new char[50];
            reader.read(characters);
            for (int i = 49; i >= 0 ; i--) {
                if (characters[i] != 0) {
                    System.out.print(characters[i]);
                }
            }
        }
    }
}
