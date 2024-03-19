package Aula02;
import java.util.Scanner;


public class ex200 {
    public static void main(String args[]){
    double n;
    double n2=0;
    double counter=0;
    double max;
    double min; 
    double media;  
    Scanner sc=new Scanner(System.in);

    System.out.print("Insere um número:");
    n=sc.nextDouble();
    counter++;
    max=n;
    min=n;
    media=n;
    if(n==0){
        n2=-1;
    }


    while(n!=n2){
    System.out.print("Insere um número:");
    n2=sc.nextDouble();
    
    counter++;
    media+=n2;
    if(n2>max){
        max=n2;
    }else if(n2<min){
        min=n2;
    }
    
    }   

    System.out.print("Média= "+(media/counter)+", Total de valores lidos: "+ counter +", Máximo: "+max+", Míninmo: "+min);
    sc.close();
    }
}
