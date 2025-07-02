package JavaStreamPractice.Pattern.Singleton;

public class MainClass {
    public static void main(String[] args) {
        EagerDemo s1 = EagerDemo.getInstance();
        EagerDemo s2 = EagerDemo.getInstance();
        System.out.println(s1 == s2);


        EnumDemo e1 = EnumDemo.Instance;
        EnumDemo e2 = EnumDemo.Instance;
        System.out.println(e1==e2);


    }
}
