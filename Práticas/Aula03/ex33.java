package Aula03;

import java.util.Scanner;
import utils.UserInput;


public class ex33 {
    private static Scanner sc=new Scanner(System.in);
    public static void main (String args[]){
    
    
    int num;
    int tentativas=0;
    String resposta="";
    int random;
    

    do{
        random=UserInput.randomnumber(0,100); //random gera um numero entre 0 e 1-----> entre 0 e 100 multiplo por 100 
        do{
            System.out.print("Adivinha um número entre 0 e 100:");
            num=sc.nextInt();
                if(num<random){
                    tentativas++;
                    System.out.println("Demasiado baixo");
                }else if(num>random){
                    tentativas++;
                    System.out.println("Demasiado alto");
                }
        }while(random!=num);
        if(num==random){
            System.out.println("O número é "+num+ " e forma feitas "+ tentativas+ " tentativas");
            System.out.println("Deseja continuar? Prima(S)im");
            resposta=sc.next();
                if(resposta.equals("S")){
                        tentativas=0; //também podia colocar no do
                        continue;
                }else if(resposta.equals("Sim")){
                        tentativas=0;
                        continue;
                }else{
                        System.out.println("Obrigado");
                        break;
                    }
        }
    }while(!resposta.equals("S") || !resposta.equals("Sim"));

    } 
}





