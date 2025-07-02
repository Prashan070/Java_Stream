package JavaStreamPractice.DSA;

public class ReverseVowelOfString {
    public static void main(String[] args) {
        String name = "Icecream";

        char[] charName = name.toCharArray();

        int i = 0;
        int j = charName.length - 1;

        while (i < j) {
            while (i < j && !isVowel(charName[i])) {
                i++;
            }
            while (i < j && !isVowel(charName[j])) {
                j--;
            }

            char temp = charName[i];
            charName[i] = charName[j];
            charName[j] = temp;
            i++;
            j--;
        }
        System.out.println(String.valueOf(charName));
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
