import java.util.*;

public class stringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    //CONCATENATION FUNCTION
        // String firstName = "Tony";
        // String lastName = "Stark";
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

    //LENGTH FUNCTION
        String firstName1 = "Tony";
        String lastName1 = "Stark";
        String fullName1 = firstName1 + lastName1;
        System.out.println(fullName1.length());

    //charAt
        String firstName2 = "Tony";
        String lastName2 = "Stark";
        String fullName2 = firstName2 + lastName2;
        for( int i = 0; i < fullName2.length(); i++){
        System.out.println(fullName2.charAt(i));
        }
    }
}
