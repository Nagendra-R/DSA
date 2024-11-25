package gfg.dsa.demo.strings.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestWord {
    public static void main(String[] args) {
        String str = "acb";
        System.out.println(str.substring(0,str.length()));
        String[] dict = {"a","b","c"};

        System.out.println(largestWord(dict,str));
    }

    private static String largestWord(String[] dict, String str) {
        String temp ="";
        boolean first = true;
        int max = 0;
        List<String> commonWords = new ArrayList<>();
        for (int k = 0; k < dict.length; k++) {
            int i=0,j=0,c=0;
            while(i<dict[k].length() &&  j<str.length()){
                if(dict[k].charAt(i) == str.charAt(j)){
                    i++;
                    c++;
                }
                j++;
            }
//            System.out.println(c);
            if(j==dict[k].length() && c>max ){
                temp = dict[k];
                max=c;
                first = false;
            }
            if(j==dict[k].length() &&  !first && c==max){
                if(dict[k].compareTo(temp)<0){
                    temp= dict[k];
                }
            }
        }
//        Collections.sort(commonWords);
//        if (commonWords.isEmpty()){
//            return "";
//        }
        return temp;

    }
}
