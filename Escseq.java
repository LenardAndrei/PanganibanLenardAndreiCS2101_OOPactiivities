public class Escseq {
    public  static void main(String[] args){
        for(int i = 1; i <= 5; i++) { //loop for the first 5 multiples of 7
            int num = i * 7;
            
            if (i % 2 == 0) {
                System.out.println("\t" + num); //print with a tab of multiples of 7        
            } else {
                System.out.println(num); //print without a tab of multiples of 7
            }
        }
    }
}
