package JavaStreamPractice.ExceptionHandling;

public class TryCatchDemo {

    public static void display() {

        try {
            int num = 19 / 0;
        } catch (Exception e) {
            throw new ArithmeticException("Wrong maths");
        }

    }


    public static void main(String[] args) {

        TryCatchDemo.display();

    }


}
