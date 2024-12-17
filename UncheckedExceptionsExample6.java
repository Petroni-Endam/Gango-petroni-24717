public class UncheckedExceptionsExample6 {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc"); // Invalid format
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
