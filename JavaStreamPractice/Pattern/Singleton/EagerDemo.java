package JavaStreamPractice.Pattern.Singleton;

public class EagerDemo {
    private EagerDemo() {
    }

    private static final EagerDemo instance = new EagerDemo();

    public static EagerDemo getInstance() {
        return instance;
    }
}
