import java.util.*;

public class returnGreaterNo {
    public static void returnGreaterNo(int a, int b){
        if (a > b) {
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            returnGreaterNo(a, b);
    }
}
