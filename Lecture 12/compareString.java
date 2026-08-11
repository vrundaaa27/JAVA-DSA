import java.util.*;

public class compareString{
    public static void main(String[] args) {
        
        String name1 = "tony";
        String name2 = "tony k";//Tony //bony

        // if (name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        // if (name1 == name2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        if (new String("Sam") == new String("Sam")) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        } // Will be covered in STRING BUILDER
    }
}