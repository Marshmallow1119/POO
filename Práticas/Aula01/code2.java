package Aula01;
import java.util.Scanner;

/** 
   This program updates an account balance, according to the table below:
         Balance      Interest Rate    Charge  
     > $100,000.00	 2.75 %	       $ 0.00
     > $25,000.00	 2.00 %	       $ 0.00
     > $10,000.00	 1.00 %	       $ 0.00
    >= $0.00	         0.00 %	       $ 0.00
     < $0.00	         0.00 %	      $ 25.00
   and prints out the new balance.
*/
public class code2{
   public static void main(String[] args)
   {
      // Define constants
      final double HI_RATE = 2.75;
      final double MD_RATE = 2.00;
      final double LO_RATE = 1.00;
      final double DEB_CHG = -25.00;

      final double HI_LIMIT = 100000.00;
      final double MD_LIMIT = 25000.00;
      final double LO_LIMIT = 10000.00;
      final double ZERO_LIMIT = 0.00;

      // Print prompt to enter a current balence
      System.out.print("Enter current balance: ");

      try (// Read balance
      Scanner in = new Scanner(System.in)) {
         double balance = in.nextDouble();
         double newbalance=0;
         
         
         if(balance>HI_LIMIT){
            newbalance=(balance*(HI_RATE/100))+balance;
         }else if(balance>MD_LIMIT){
            newbalance=balance*(MD_RATE/100)+balance;
         }else if(balance>LO_LIMIT){
            newbalance=balance*(LO_RATE/100)+balance;
         }else if(balance>=ZERO_LIMIT){
            newbalance=balance;
         }else{
            newbalance=balance+DEB_CHG;
         }
         System.out.printf("%.2f\n", newbalance);
      }
   }
}