package Aula02;

import java.util.Scanner;

public class ex27 {
    public static void main(String args[]){
        double x1;
        double y1;
        double x2;
        double y2;
        double distancia=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("X do ponto P1?");
        x1=sc.nextDouble();
        System.out.print("Y do ponto P1?");
        y1=sc.nextDouble();
        System.out.print("X do ponto P2?");
        x2=sc.nextDouble();
        System.out.print("Y do ponto P2?");
        y2=sc.nextDouble();

        sc.close();

        //distância de P1 a P2

        distancia=Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2));

        System.out.print("Distância do P1 a p2 é "+Math.round(distancia)); //Arrendondado ou String resultado=String.format("%.2f",distancia)


    }
}
