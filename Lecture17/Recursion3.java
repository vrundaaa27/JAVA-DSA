import java.util.*;

// public class Recursion3 {
//     public static void printSum(int i, int n, int sum){
//         if (i == n) {
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         printSum(i+1, n, sum);;
//     }
//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }

public class Recursion3{
    public static void printSum(int a, int b, int sum){
        if (a == b) {
            sum += a;
            System.out.println(sum);
            return;
        }
        sum += a;
        printSum(a+1, b, sum);
    }
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}
