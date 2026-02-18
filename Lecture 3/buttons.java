import java.util.*;

public class buttons {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // int button = sc.nextInt();

        // if (button == 1) {
        //     System.out.println("yes");
        // }
        // else if (button == 2) {
        //     System.out.println("no");
        // }
        // else if (button == 3) {
        //     System.out.println("maybe");
        // }
        // else{
        //     System.out.println("invalid");

        switch(button) {
    
            case 1: System.out.println("Vrunda");
                  break;
            case 2: System.out.println("Yashwant");  
                  break;
             case 3: System.out.println("Kirti");                
                  break;
            default: System.out.println("Invalid");
                break;
        }
        }
    }

