package class31_7;
import java.io.FileReader;
import java.io.IOException;

public class fileread{
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
