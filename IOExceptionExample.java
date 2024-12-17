import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistent.txt");
            BufferedReader fileInput = new BufferedReader(file);
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
