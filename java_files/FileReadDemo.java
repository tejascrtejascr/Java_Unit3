import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("sample.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
