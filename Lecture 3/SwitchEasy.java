import java.util.*;

public class SwitchEasy {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        switch(button) {
            case 1: System.out.println("Vrunda");
                break;
            case 2: System.out.println("Madhura");
                break;
            case 3: System.out.println("Siddhi");
                break;
            case 4: System.out.println("DD");
                break;    
            default: System.out.println("Invalid");
                break;
        }
    }

    
}
