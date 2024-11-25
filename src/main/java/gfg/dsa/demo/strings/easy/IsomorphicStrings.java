package gfg.dsa.demo.strings.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "yktbvpmxnuo";
        String s2 = "murlidsaris";
        System.out.println(checkIsomorphic(s1,s2));
    }

    private static boolean checkIsomorphic(String s1, String s2) {
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            map1.put(s1.charAt(i),s2.charAt(i));
        }

        for(int i=0;i<s2.length();i++){
            map2.put(s2.charAt(i),s1.charAt(i));
        }

        for(int i=0;i<s1.length();i++){
            if(map1.get(s1.charAt(i)) != s2.charAt(i) ||  map2.get(s2.charAt(i)) != s1.charAt(i)){
                    return false;
            }
        }
        return true;
    }
}
