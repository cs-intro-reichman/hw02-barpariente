public class OneOfEachStats {
    public static void main(String[] args) {
        
        int T = Integer.parseInt(args[0]); 
        int families2 = 0; 
        int families3 = 0; 
        int families4 = 0; 
        int child = 0; 
        int common = 0; 
        int avg = 0; 
        
        for (int i =0; i<T; i++) {

            child = 1; 

            int first = (int)((Math.random()*2));
            int gender = first;

                while (gender == first) {

                    gender = (int)((Math.random()*2));
                    
                    child ++; 
                 }
            if (child == 2){
                families2 ++;
            }     
            else if (child == 3){
                families3 ++; 
            }
            else {
                families4 ++; 
            }
            avg = avg + child; 

}
        double avarege = ((double)(avg) / (double) (T)); 
        System.out.println("Average: " + avarege + " children to get at least one of each gender");
        System.out.println("Number of families with 2 children: " + families2);
        System.out.println("Number of families with 3 children: " + families3);
        System.out.println("Number of families with 4 or more children: " + families4);   

        if ((families2 > families3)&&(families2 > families4)) {

            System.out.println("The most common number of children is 2"); 
        }
        else if ((families3 > families2)&&(families3 > families4)) {

            System.out.println("The most common number of children is 3"); 
 
        }
        else {

            System.out.println("The most common number of children is 4 or more");
        }
        
    }    
}
