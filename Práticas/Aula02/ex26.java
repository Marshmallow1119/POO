package Aula02;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tempo (segundos): ");
        int segundos = sc.nextInt();

        sc.close();

        int segs = segundos % 60; // % é o resto da divisão
        int mins = (segundos / 60) % 60; // / é a divisão inteira
        int horas = (segundos) / 3600;

        System.out.println("O tempo formatado é:");
        System.out.println(String.format("%02dh:%02dm:%02ds", horas, mins, segs));
    }
}
