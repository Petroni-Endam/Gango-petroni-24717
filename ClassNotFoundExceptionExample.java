public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.nonexistent.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
        }
    }
}
