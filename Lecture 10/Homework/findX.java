import java.util.*;

public class findX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        sc.nextLine(); // To consume the newline character after reading the integer
        int [] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of x to find:");
        int x = sc.nextInt();

        for( int i = 0 ; i < arr.length; i++){
            if ( arr [i] == x) {
                System.out.println("X occurs at index:" + i);
            }
        }
    }    
}
