public class DamkaBoard {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        String rows = ""; 
        String rvs = ""; 
        
        for (int i = 1; i<=a; i++ ){
            
            rows = rows + "* " ;
            rvs = rvs + " *"; 

        }
        for (int i = 1; i <= a; i++ ){
            if ((i%2) == 0){

                System.out.println(rvs);
            }
            else {
                System.out.println(rows);
            } 

        }
    }
}
