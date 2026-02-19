import java.util.*;

public class printMyNumber {
    public static void printMyNumber(int number){
        System.out.println(number);
        return;
    }  
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printMyNumber(number);
    }
}