import java.util.*;

public class userIpArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine(); // To consume the newline character after reading the integer
        
        // int [] number = new int [size];

        // for( int i = 0; i < size; i++){
        //     number[i] = sc.nextInt();
        // }

        // for( int i = 0; i < size; i++){
        //     System.out.println(number[i]);
        // }
        
        //By taking user input for WAY TWO
        
        String [] names = new String [size];

        for (int j = 0; j < size; j++){
            names[j] = sc.nextLine();
        }

        for (int j = 0; j < size; j++){
            System.out.println(names[j]);
        }
    }    
}
