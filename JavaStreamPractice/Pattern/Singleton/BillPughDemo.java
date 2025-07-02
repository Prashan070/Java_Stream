package JavaStreamPractice.Pattern.Singleton;

public class BillPughDemo {
    private BillPughDemo() {

    }

    private static class BillPughHelper {
        private static final BillPughDemo instance = new BillPughDemo();
    }

    public static BillPughDemo getInstance() {
        return BillPughHelper.instance;
    }
}
