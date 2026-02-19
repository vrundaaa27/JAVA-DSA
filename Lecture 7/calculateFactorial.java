import java.util.*;

public class calculateFactorial {
    public static void calculateFactorial(int n){
        int factorial = 1;

        if (n < 1) {
            System.out.println("Invalid Case");
            return;
        }
        for(int i = n; i >= 1; i--){
            factorial = factorial*i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
    }
}
