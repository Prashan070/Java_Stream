package JavaStreamPractice.DSA;

public class FirstUniqueCharaterofString {

    public static int firstMethod() {
        String name = "level";
        int[] ch = new int[26];


        for (int i = 0; i < name.length(); i++) {
            ch[name.charAt(i) - 'a']++;
        }


        //ch[l-a]--2
        //ch[
        for (int i = 0; i < name.length(); i++) {
            if (ch[name.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // no unique char
    }

    public static void main(String[] args) {
        System.out.println(firstMethod()); // Output: 2 for "level"
    }
}
