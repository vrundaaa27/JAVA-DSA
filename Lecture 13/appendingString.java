import java.util.*;

public class appendingString{
    public static void main(String[] args) {
        
        //To append i.e add somethimg at the end
        StringBuilder sb = new StringBuilder("H");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}