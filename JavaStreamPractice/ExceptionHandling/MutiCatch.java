package JavaStreamPractice.ExceptionHandling;

public class MutiCatch {

    public static void display() {

        try {
            int num =100/0;
        }catch (ArithmeticException | NullPointerException e){

        }finally {
            System.out.println("prashan");
        }

    }

    public static void main(String[] args) {
       MutiCatch.display();
    }
}

