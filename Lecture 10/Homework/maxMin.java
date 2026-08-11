import java.util.*;

public class maxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] no = new int[size];

        for( int i = 0 ; i < no.length; i++){
            no[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < no.length; i++){
            if (no[i] > max) {
                max = no[i];
            }
            if (no[i] < min) {
                min = no[i];  
            }
        }
        System.out.println("Largest no is:" + max);
        System.out.println("Smallest no is:" + min);
    }
}

