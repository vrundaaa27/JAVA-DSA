public class print_half_pyramid_no {
    public static void main(String[] args) {
        
        int n = 6;

        //outer loop
        // for( int i = 1; i <= n; i++){
        //     //inner loop
        //     for( int j = 1; j <= i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();

        // inverted half pyramid
        for( int i = 1; i <= n; i++){
            for( int j = 1; j <= n - i + 1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
         

        }
    }
    
}
