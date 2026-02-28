import java.util.*;

public class findX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter columns: ");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter X :");
        int x = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if (numbers[i][j] == x) {
                System.out.print("X found at location(" + i + "," + j + ")");
                }
            }
        }
    }
}
