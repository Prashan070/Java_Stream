package JavaStreamPractice.Pattern.Singleton;

public class LazyDemo {
    private LazyDemo() {

    }

    private static LazyDemo instance;

    public static LazyDemo getInstance() {
        if (instance == null) {
            instance = new LazyDemo();
        }
        return instance;
    }
}
