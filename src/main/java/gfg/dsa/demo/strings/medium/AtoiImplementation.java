package gfg.dsa.demo.strings.medium;

public class AtoiImplementation {
    public static void main(String[] args) {
        String str ="   -1234";
//        System.out.println(atoiFunction(str));

    }

    private static int atoiFunction(String str) {
        int i =0;
        boolean sign = true;
        while(i< str.length() && str.charAt(i)==' '){
            i++;
        }
        if(str.charAt(i)=='-'){
            sign = false;
        }
        if(str.charAt(i)=='+'){
            sign = true;
        }

//        while(i)
        return 0;



    }
}
