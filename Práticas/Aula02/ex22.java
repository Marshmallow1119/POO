package Aula02;

import java.util.Scanner;


public class ex22 {
    
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        double celsius;
        double Fahrenheit;
        System.out.print("Celsius para converter?");
        celsius=a.nextDouble();
        Fahrenheit=1.8*celsius+32;
        System.out.println(celsius+" ºC "+" = "+Fahrenheit+" F");
        
        a.close();
    }
}
