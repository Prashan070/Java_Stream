package JavaStreamPractice.DSA;

public class LengthofLastWord {

    public static int countLength(String name) {
        name = name.trim();
        int count = 0;

        for (int i = name.length() - 1; i >= 0; i--) {
            if (name.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String name = "Hello World";
        System.out.println(LengthofLastWord.countLength(name));

    }
}
