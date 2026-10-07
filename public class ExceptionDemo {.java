public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 20, b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}