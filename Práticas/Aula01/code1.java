package Aula01;
  
import java.util.Scanner;

public class code1 {
   // Create a Scanner to parse standard input:
   private static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      double tempC,tempF;
      System.out.print("Celsius? ");
      tempC=sc.nextDouble();
      tempF=1.8 * tempC +32;
      System.out.println(tempC+" C "+" = "+tempF+" F");
      System.out.println("THE END");
   }
}

