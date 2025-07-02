package JavaStreamPractice.Pattern.Singleton;

public class SyncronizedBlockDemo {
    private SyncronizedBlockDemo() {
    }

    private static SyncronizedBlockDemo instance;

    synchronized  public static SyncronizedBlockDemo getInstance() {
      if (instance == null) {
            instance = new SyncronizedBlockDemo();
        }
        return instance;
    }

}
