public class half_pyramid {
    public static void main(String[] args) {
        
        int n = 5;

        // for( int i = 1; i <= n; i++){

        //     for( int j = 1; j <= i; j++){

        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // inverted pyramid
        // for( int i = n; i >= 1; i--){
        //     for( int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // inverted and rotated by 180'
        for( int i = 1; i <= n; i++){
            //inner loop -> for spaces
            for( int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            // for stars
            for( int a = 1; a <= i; a++){
                System.out.print("*");
            }
            System.out.println();        
        }
    }
    
}
