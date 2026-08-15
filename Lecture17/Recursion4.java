import java.util.*;

public class Recursion4 {
    // public static int calculateFactorial(int n){
    //     if (n == 1 || n == 0) {
    //         return 1;
    //     }
    //      int fact_nMinus1 = calculateFactorial(n-1);
    //      int fact_n = n * fact_nMinus1;
    //      return fact_n;
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     int ans = calculateFactorial(n);
    //     System.out.println(ans);
    // }

    public static int calcuFact(int a){
        if (a == 1 || a == 0) {
            return 1;
        }
        int fact_am1 = calcuFact(a - 1);
        int fact_a = a * fact_am1;
        return fact_a;
    }
    public static void main(String[] args) {
        int a = 5;
        int ans = calcuFact(a);
        System.out.println(ans);
    }
}