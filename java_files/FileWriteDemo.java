import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Java File Handling");
        fw.close();
        System.out.println("File written successfully");
    }
}
