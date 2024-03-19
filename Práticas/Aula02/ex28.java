package Aula02;

import java.util.Scanner;

public class ex28 {
    public static void main(String args[]){
        double C1;
        double C2;
        double H=0;
        double angulo;

        Scanner sc=new Scanner(System.in);
        System.out.print("Valor do cateto 1?");
        C1=sc.nextDouble();
        System.out.print("Valor do cateto 2?");
        C2=sc.nextDouble();
        sc.close();
        
        H=Math.sqrt(Math.pow(C1,2)+Math.pow(C2,2));
        String resultado=String.format("%.2f",H);
        System.out.println("A hipotenusa tem o valor de " + resultado);

        angulo= Math.toDegrees(Math.asin(C2/H));
        String resultado2=String.format("%.2f",angulo);
        System.out.println("O ângulo entre A e a Hipotenusa tem o valor de " + resultado2 + "º");


    }
}
