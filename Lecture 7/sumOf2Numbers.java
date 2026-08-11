import java.util.*;

public class sumOf2Numbers{
    public static int sumOf2Numbers(int a, int b){
        int sum = a + b ;
        System.out.println(sum);
        return sum;
    }    
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumOf2Numbers(a, b);
    }
}
