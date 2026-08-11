import java.util.*;

public class calculateProduct {
    public static int calculateProduct(int a, int b){
        int product = a * b;
        System.out.println(product);
        return product;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateProduct(a, b);
    }
}
