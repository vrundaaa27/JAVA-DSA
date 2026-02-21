import java.util.*;

public class arrBasics {
    public static void main(String[] args) {
        int [] marks = new int [3];
        marks[0] = 71;
        marks[1] = 80;
        marks[2] = 86;

        //To get marksone by one ad=fter declaring
        System.out.println(marks[1]);

        //To get marks altogether using loops
        for(int i = 0; i < 3; i++){
            System.out.println(marks[i]);
        }
    }
}
