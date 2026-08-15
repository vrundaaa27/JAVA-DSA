import java.util.*;

//Print no's from n = 5 to 0
public class Recursion2 {
    public static void printNumb(int n){
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }
    public static void main(String[] args) {
        int n = 0;
        printNumb(n);
    }
}    
