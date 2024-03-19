package Aula02;

import java.util.Scanner;

public class ex23 {
    
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        double quantidade;
        double tempI;
        double tempF;
        double energia;

        a.close();

        System.out.print("Quantidade de Água (kg)?");
        quantidade=a.nextDouble();
        System.out.print("Temperatura Inicial (ºC)?");
        tempI=a.nextDouble();
        System.out.print("Temperatura Final (ºC)?");
        tempF=a.nextDouble();

        energia=quantidade*(tempF-tempI)*4184;

        System.out.println("Com "+quantidade+" km de água é necessário "+energia+" joules de energia");
    }
}
