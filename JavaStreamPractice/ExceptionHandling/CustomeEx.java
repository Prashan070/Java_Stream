package JavaStreamPractice.ExceptionHandling;

class CustEx extends RuntimeException {
    CustEx(String message) {
        super(message);
    }
}


public class CustomeEx {

    public static void display() {
        try {
            int num = 99 / 0;
        } catch (RuntimeException e) {
            throw new CustEx("Wrong Math");
        }
    }


    public static void main(String[] args) {
        CustomeEx.display();

    }
}
