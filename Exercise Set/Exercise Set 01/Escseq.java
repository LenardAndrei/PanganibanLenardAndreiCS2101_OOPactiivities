import java.util.Scanner;

public class Escseq {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of multiple of 7: ");
        double num = scanner.nextDouble();

        scanner.close();
        
        for(int i = 1; i <= num; i++) { //loop for the first 5 multiples of 7
            int num1 = i * 7;
            
            if (i % 2 == 0) {
                System.out.println("\t" + num1); //print with a tab of multiples of 7        
            } else {
                System.out.println(num1); //print without a tab of multiples of 7
            }
        }
    }
}
