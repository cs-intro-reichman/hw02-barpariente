public class DamkaBoard {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        String rows = ""; 
        
        for (int i = 0; i<a; i++ ){
            rows = rows + "* " ; 

        }
        for (int i = 0; i<a; i++ ){
            if ((i%2) == 0){
                System.out.println(" " + rows);
            }
            else {
                System.out.println(rows);
            } 

        }
    }
}
