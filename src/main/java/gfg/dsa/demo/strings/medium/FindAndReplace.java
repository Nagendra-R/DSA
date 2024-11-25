package gfg.dsa.demo.strings.medium;

public class FindAndReplace {
    public static void main(String[] args) {
        String s = "abababa";
        String s1 = "aba";
        String s2 = "a";
        System.out.println(findAndReplaceWithS2(s,s1,s2));

    }

    private static String findAndReplaceWithS2(String s, String s1, String s2) {
        StringBuilder replacedString = new StringBuilder();
        int i=0;
        while(i<=s.length()-s1.length()){
            String temp = s.substring(i,i+s1.length());
            if(temp.equals(s1)){
                replacedString.append(s2);
                i +=3;
            }else{
                replacedString.append(s.charAt(i));
                i +=1;
            }
        }
        return replacedString.toString();
    }
}
