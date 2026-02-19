import java.util.*;

public class calculateCircumference {
    public static double calculateCircumference(double radius){
        double circumference = 2 * 3.14 * radius;
        System.out.println(circumference);
        return circumference;
        // return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        calculateCircumference(radius);
        // System.out.println(calculateCircumference(radius));
    }
}
