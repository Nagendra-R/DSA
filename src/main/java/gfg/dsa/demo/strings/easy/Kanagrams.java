package gfg.dsa.demo.strings.easy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Kanagrams {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "grammar";
        System.out.println(checkAnagram(str1, str2, 3));


    }

    private static boolean checkAnagram(String str1, String str2, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            } else {
                map.put(str1.charAt(i), 1);
            }
        }

//        System.out.println(map);

        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(str2.charAt(i)) && map.get(str2.charAt(i)) > 0) {
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            }
        }

//        System.out.println(map);

        Collection<Integer> values = map.values();
//        System.out.println(values);
        for (Integer value : values){
            count += value;
        }


//        for (int i = 0; i < str1.length(); i++) {
//            System.out.println(str1.charAt(i) + "   "+ map.get(str1.charAt(i)));
//            count += map.get(str1.charAt(i));
//        }

//        System.out.println(count);
        return count <= k;
    }


}
