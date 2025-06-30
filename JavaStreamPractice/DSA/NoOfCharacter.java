package JavaStreamPractice.DSA;

import java.util.HashMap;

public class NoOfCharacter {

    public static void CountNoOccurance(String name) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            map.put(name.charAt(i), map.getOrDefault(name.charAt(i), 0)+1);
        }

        System.out.println(map);
    }

    public static void main(String[] args) {

        String name = "BANANANANA";

        NoOfCharacter.CountNoOccurance(name);
    }
}

//O(N), O(N)