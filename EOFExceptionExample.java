import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try {
            DataInputStream input = new DataInputStream(new FileInputStream("sample.txt"));
            while (true) {
                input.readInt(); // Keep reading until EOFException
            }
        } catch (EOFException e) {
            System.out.println("EOFException occurred: End of file reached.");
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
