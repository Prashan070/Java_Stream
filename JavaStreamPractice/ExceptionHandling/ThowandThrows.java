package JavaStreamPractice.ExceptionHandling;

public class ThowandThrows {

    public static void display() throws ArithmeticException {
        int num = 19 / 0;
    }

    public static void main(String[] args) {

        try {
            ThowandThrows.display();
        } catch (ArithmeticException e) {
            throw new RuntimeException("Same error");
        }

    }
}
