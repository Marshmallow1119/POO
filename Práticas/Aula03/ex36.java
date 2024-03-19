package Aula03;

import java.util.Scanner;
import utils.UserInput;

public class ex36 {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
    String frase;

    System.out.print("Escreve uma palavra, frase ou parágrafo: ");
    frase=sc.next();
    String[] frasefinal=UserInput.up(frase);
    String up=frasefinal[0];
    String ultimo=frasefinal[1];
    String primeiros=frasefinal[2];

    System.out.println(up);
    System.out.println(ultimo);
    System.out.print(primeiros);
    

    }
}
