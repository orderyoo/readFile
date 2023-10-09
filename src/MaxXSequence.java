import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaxXSequence {
    public static void main(String[] args) {
        String fileName = "24_demo.txt"; // Замените на путь к вашему файлу
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int maxSequenceLength = 0;
            int currentSequenceLength = 0;

            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char currentChar = line.charAt(i);
                    if (currentChar == 'X') {
                        currentSequenceLength++;
                    } else {
                        if (currentSequenceLength > maxSequenceLength) {
                            maxSequenceLength = currentSequenceLength;
                        }
                        currentSequenceLength = 0;
                    }
                }
            }

            if (currentSequenceLength > maxSequenceLength) {
                maxSequenceLength = currentSequenceLength;
            }

            reader.close();

            System.out.println("Самая длинная последовательность символов 'X': " + maxSequenceLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
