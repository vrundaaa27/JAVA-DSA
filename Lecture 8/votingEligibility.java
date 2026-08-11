import java.util.*;

public class votingEligibility{
    public static void votingEligibility(int age){
        if(age >= 18){
            System.out.println("You can vote");
        }else{
            System.out.println("You cannot vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        votingEligibility(age);
    }
}