package JavaStreamPractice.DSA;

import java.util.HashMap;
import java.util.Map;

public class IsomorpicString {

    public static boolean isomorMethod() {
        String s1 = "egg";
        String s2 = "add";

        Map<Character, Character> mapS1 = new HashMap<>();
        Map<Character, Character> mapS2 = new HashMap<>();

        char[] arrS1 = s1.toCharArray();
        char[] arrS2 = s2.toCharArray();

        for (int i = 0; i < arrS1.length; i++) {
            if (mapS1.containsKey(arrS1[i])) {
                if (mapS1.get(arrS1[i]) != arrS2[i]) {
                    return false;
                }
            }
            mapS1.put(arrS1[i], arrS2[i]);


            if (mapS2.containsKey(arrS2[i])) {
                if (mapS2.get(arrS2[i]) != arrS1[i]) {
                    return false;
                }
            }
            mapS2.put(arrS2[i], arrS1[i]);
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(       IsomorpicString.isomorMethod());


    }
}
