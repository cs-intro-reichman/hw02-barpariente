public class Perfect {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int sum = 0; 
        String action = ""; 
        String fin = ""; 

        for (int i = 1; i < a ; i++ ) {
            if ( (a % i) == 0){
                sum = sum + i;
                action = action + i + " + " ; 
            }
        }

        if (sum == a) {
            
            // remove of the last "+"

            for (int i = 0 ; i < action.length() - 2; i++) {

                fin = fin + action.charAt(i); 

            }
   
            System.out.println( a + " is a perfect number since " + a + " = " + fin); 
            
        }
        else {
            System.out.println( a + " is not a perfect number"); 
        }
       
    }
}
