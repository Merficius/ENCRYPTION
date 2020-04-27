import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int counter = 0;

            int prev = ' ';
            int next = reader.read();
            while (next != -1 && prev != -1) {
                if (prev == ' ' && next != ' ') {
                    counter++;
                }

                prev = next;
                next = reader.read();
            }
            System.out.println(counter);
        }
    }

}
