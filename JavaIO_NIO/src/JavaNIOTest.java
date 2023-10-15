import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class JavaNIOTest {
    public static void main(String[] args) {

        CharBuffer buffer = CharBuffer.allocate(8);
        String text = "sda";
        System.out.println("Input text: " + text);

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            buffer.put(c);
        }
        System.out.println("Position after data is written into buffer: " + Arrays.toString(buffer.array()));

        String filePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java - zaawansowana\\JavaIO_NIO\\JavaNIOauto.txt";

        try {
            Path path = Paths.get(filePath);
            if(!Files.exists(path)) { //sprawdzamy czy plik nie istnieje
                Files.createFile(path);
            }
            //metoda write() zapisuje do pliku: WRITE - zacznie zapisywanie od poczatku, APPEND - dopisze do konca pliku
            Files.write(path, "A long time ago in a galaxy far, far away....".getBytes(), StandardOpenOption.WRITE);
            Files.write(path, "in a galaxy far, ".getBytes(), StandardOpenOption.APPEND);
            Files.write(path, "far away....".getBytes(), StandardOpenOption.APPEND);
            for (String line : Files.readAllLines(path)) {
                System.out.println(line);
            }
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
