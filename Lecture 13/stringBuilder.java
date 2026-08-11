import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //To get character at a specific position from index
        System.out.println(sb.charAt(0));

        //To set char at some index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //To insert char at some index
        sb.insert(0,'s');
        System.out.println(sb);
        sb.insert(3,'n');
        System.out.println(sb);

        //To delete char at some index
        sb.delete(3,4);
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
    }
}
