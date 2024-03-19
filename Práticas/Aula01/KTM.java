package Aula01;

import java.util.Scanner;

public class KTM {
    public static void main(String[] args) {
		double km, miles;
        Scanner sc= new Scanner(System.in);
        System.out.print("Insira uma distância em Km:");
        km=sc.nextDouble(); //vai buscar o que esta no input
        miles = km/1.609;
        System.out.print("A distância em milhas é " + miles);
        sc.close();
        }
}
