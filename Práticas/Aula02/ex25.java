package Aula02;

import java.util.Scanner;

public class ex25 {
    
    public static void main(String args[]){
        Scanner a=new Scanner(System.in); //podemos colocar em vez de private public
        double v1;
        double v2;
        double d1;
        double d2;
        double vmf;
        
        a.close();

        System.out.print("Velocidade 1?");
        v1=a.nextDouble();
        System.out.print("Distância no trajeto 1?");
        d1=a.nextDouble();
        System.out.print("Velocidade 2?");
        v2=a.nextDouble();
        System.out.print("Distância no trajeto 2?");
        d2=a.nextDouble();

        vmf=(v1 * v2 * (d1 + d2)) / (d1 * v2 + d2 * v1);
        System.out.println("A velocidade média final é "+vmf+".");


    }

}
