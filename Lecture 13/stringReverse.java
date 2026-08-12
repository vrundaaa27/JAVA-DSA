import java.util.*;

public class stringReverse {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("hello");

        for (int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);

        //Reverse Vrunda

        StringBuilder sb1 = new StringBuilder("Vrunda");

        for( int j = 0; j < sb1.length()/2; j++){
            int front = j;
            int back = sb1.length() - 1 - j;

            char frontChar1 = sb1.charAt(front);
            char backChar1 = sb1.charAt(back);

            sb1.setCharAt(front, backChar1);
            sb1.setCharAt(back, frontChar1);
        }
        System.out.println(sb1);
    }
}
