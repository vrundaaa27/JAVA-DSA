import java.util.*;

public class inputNames{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        sc.nextLine(); // To consume the newline character after reading the integer

        String[] names = new String[size];

        for( int i = 0; i < names.length; i++){
            names[i] = sc.nextLine();
        }

        for( int i = 0; i < names.length; i++){
            System.out.println("Name: " + names[i]);
        }
    }
}