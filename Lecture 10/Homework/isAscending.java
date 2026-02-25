import java.util.*;

public class isAscending {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int [] number = new int[size];

        System.out.println("Enter array elements:");
        for(int i = 0; i < number.length; i++){
            number[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i = 0; i < number.length -  1; i++) //- 1 is condition for termination 
        {
            if (number[i] > number[i + 1]) {
                isAscending = false; //Condition for descending order
            }
        }

        if (isAscending) {
            System.out.println("Array is sorted in Ascending order.");
        }else{
            System.out.println("Array is NOT sorted in Ascending order.");
        }
        //  System.out.println("Array elements are: " + Arrays.toString(number));
    }    
}
