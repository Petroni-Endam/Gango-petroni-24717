public class UncheckedExceptionsExample4 {
    public static void main(String[] args) {
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // Invalid type cast
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}
