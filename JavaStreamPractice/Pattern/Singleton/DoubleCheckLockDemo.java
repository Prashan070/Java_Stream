package JavaStreamPractice.Pattern.Singleton;

public class DoubleCheckLockDemo {
    private DoubleCheckLockDemo() {
    }

    private static volatile DoubleCheckLockDemo instnace;

    public static DoubleCheckLockDemo getInstance() {
        if (instnace == null) {
            synchronized (DoubleCheckLockDemo.class) {
                if (instnace == null) {
                    instnace = new DoubleCheckLockDemo();
                }
            }
        }
        return instnace;
    }
}
