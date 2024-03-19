package Aula02;

import java.util.Scanner;

public class ex24 {
    
    public static void main(String args[]){
        Scanner a=new Scanner(System.in); 
        double minvestido;
        double taxa;
        double mfinal=0;
        double mes;

        a.close();

        System.out.print("Montante investido inicialmente?");
        minvestido=a.nextDouble();
        System.out.print("Taxa de juro mensal?");
        taxa=a.nextDouble();
        System.out.print("Duração(nºde meses)?");
        mes=a.nextDouble();
        
        for (int x = 1; x<=mes; x++){
            if(x==1){
                mfinal=minvestido+(minvestido*(taxa/100));
            }else if (x>1){
                mfinal=mfinal+(mfinal*(taxa/100));
            }
            
        }

        System.out.println("Com "+minvestido+" euros investidos e uma taxa de juro de "+taxa+"% o montante ao fim de "+mes+" meses será de "+mfinal+" euros");





    }
}
