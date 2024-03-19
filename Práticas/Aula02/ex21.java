package Aula02; // Isto significa que todas as classes que produzir nesta “pasta” pertencem a um “pacote” (i.e., conjunto) de 
                //  classes Java que, neste caso, estão associados à “Aula2”. Este mecanismo permite assim 
                // aceder a classes de umas aulas para as outras. 

import java.util.Scanner;

public class ex21 {
        
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            float km;
            float milhas;
            System.out.print("Quantos km queres converter para milhas?");
            km=sc.nextFloat();
            milhas=(float) (km/1.609);  
            System.out.println(km+ " km são "+milhas+" milhas.");

            sc.close();

        }
}
