package gfg.dsa.demo.strings.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("the", "quick", "brown", "fox", "quick");
//        String[] words = {};
        String str1 = "the";
        String str2 = "fox";
        System.out.println(minimumDistance(words, str1, str2));
    }

    private static int minimumDistance(List<String> words, String str1, String str2) {
        int ans = Integer.MAX_VALUE;
        int x = -1;
        int y = -1;

        for (int i = 0; i < words.size(); i++) {
            if (str1.equals(words.get(i))) {
                x = i;
            }
            if (str2.equals(words.get(i))) {
                y = i;
            }

            if (x != -1 && y != -1) {
                ans = Math.min(ans, Math.abs(x - y));
//                System.out.println(x +"  "+ y);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}