package gfg.dsa.demo.arrays.medium;

public class Factorial {
    public static void main(String[] args) {
        int n= 10;
        factorial(n);
//        factorialOfBigNumber(100);
    }

    private static void factorial(int n) {
        int ans =1;
        for(int i=2;i<=n;i++){
            ans *=i;
        }
        System.out.println(ans);
    }
}
