package Aula03;

import java.util.Scanner;

public class ex32 {
    public static void main(String args[]){
        
            Scanner sc=new Scanner(System.in);
            double montante;
            int juro;

            
            do{
            System.out.print("Montante investido?");
            montante=sc.nextDouble();
            }while(montante%1000!=0 || montante<0);
            
            
            do{
            System.out.print("Taxa de juro?");
            juro=sc.nextInt();
            }while(juro<0 && juro>5);

            for(int i=1;i<=12;i++){
                    montante+=montante*juro/100;
                    System.out.printf("No mês %02d, o valor mensal é %.2f euros.\n",i,montante);
                }
                
            sc.close();
        }
        
}
            
