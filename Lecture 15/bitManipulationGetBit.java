import java.util.*;

public class bitManipulationGetBit{
    public static void main(String[] args) {
        
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;

        if ((bitMask & n) == 0) {
            System.out.println("Bit is zero");
        }else{
            System.out.println("Bit is one");
        }

        int n1 = 3;
        int pos1 = 1;
        int bitMask1 = 1>>pos;

        if ((bitMask1 & n1) == 0) {
            System.out.println("Bit is zero");
        }else{
            System.out.println("Bit is one");
        }
    }
}
