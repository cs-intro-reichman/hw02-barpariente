public class Reverse {
    public static void main(String[] args) {

        String a = (args[0]);
        String aRvs = ""; 
        String middle = ""; 

        for (int i = (a.length() - 1); i >= 0; i--) {
        
            if (a.length() % 2 == 0) {

                if ( i == (a.length() / 2) - 1 ) {
                middle = middle + a.charAt(i); 

                }
             
            }
            else {

                if ( i == (a.length() / 2) ) {
                middle = middle + a.charAt(i); 

            }
            
        }
            char b = a.charAt(i);
            aRvs = aRvs + b;
    }

        System.out.println(aRvs);
        System.out.println("The middle character is " + middle); 
        
    }
}
