public class InOrder {
    public static void main(String[] args) {

        int randFirst = (int)(Math.random()*(10));
        int randSecond = 0; 
       
        while (randFirst >= randSecond){

            System.out.println(randFirst);
            randSecond = randFirst; 
            randFirst = (int)(Math.random()*(10));
        }
       
    }
}
