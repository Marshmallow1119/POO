package Aula07;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;


public class UserInput {
    private static Scanner sc=new Scanner(System.in);
    
    
    
    public static int Validar(int min,int max){
        int n;
        do{
            System.out.printf("Insira um número:");
            n=sc.nextInt();
        } while(n<min || n>max);
        return n;
    }
    public static boolean validarprimo(int num){
        if((num==1)|| (num==0))
            return false;
        
        for(int i=2;i<num;i++)
            if(num%i==0)
               return false;
        return true;
        }

    public static boolean validarint(int num){
        if(num>0)
            return true;
        return false;
    }

    public static int isPositive(){   
        int n;
        do{
            System.out.printf("Insira um número inteiro:");
            n=sc.nextInt();
        } while(n<0);
        return n;
    }


    public static double isPositiveDouble(){   
        double n;
        do{
            System.out.printf("Insira um número:");
            n=sc.nextDouble();
        } while(n<0);
        return n;
    }

    public static int randomnumber(int a,int b){
        int random;
        Random rand=new Random();
        random=rand.nextInt((b-a)+1)+a;
        return random;
    }

    public static float validanota(Double NP,Double NT){
        int NF=0;
        if((NP<7) || (NT<7)){
            NF=66;
        }else{
            NF=(int)Math.round(0.4*NT+0.6*NP);
        }
        return NF;
            
    }



    public static String[] validadata(){
        String data,ano="0000";
        String mes="00";
        while(true){
                System.out.print("Insere uma data válida do formato mm/yyyy:");
                data=sc.next();
                
                String[] date=data.split("/");
                if(date.length==2){
                    mes=date[0];
                    ano=date[1];
                }
                if(((mes.length()==2) && ((Integer.parseInt(mes)<=12) && (Integer.parseInt(mes)>=1)))  && ((ano.length()==4) && (Integer.parseInt(ano)>0)))  
                    break;
        }
        return new String[] {mes,ano};
        
    }

    public static int monthdays(int mes, int ano){
        int days;

        if(mes==1|| mes==3 || mes==5 || mes==7 || mes==8 || mes==9 || mes==12){
            days=31;
        }else if(mes==2){
            if(bissexto(ano))
                days=29;
            else
                days=28;  
        }else{
            days=30;
        }
        return days; 
    }




    public static boolean bissexto(int ano) {
        if((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }


    public static String[] up(String n){
        String first2;
        String lastcarac;
        String frasefinal;
        
        
        String[] sep=n.split(" ");

    if(sep.length==1){
         StringBuilder n2= new StringBuilder();
                for(int i=0;i<n.length();i++){
                    String n3=n.toUpperCase();
                    n2.append(n3.charAt(i));
                }
        frasefinal=n2.toString();
        String[] lista=n.split("");
        lastcarac=lista[lista.length-1];
        StringBuilder first= new StringBuilder();
                if(lista.length>=3){
                    for(int t=0;t<3;t++){
                    first.append(lista[t]);
                    }
                first2=first.toString();
                }else{
                    first2=n;
                }
        String[] metodos={frasefinal,lastcarac,first2};
        return metodos;
        
    }
    return sep;
    }
    public static double ValidateDouble(double d, double e, String string) {
        double n;
        do{
            System.out.printf("Insira um número:");
            n=sc.nextDouble();
        } while(n<d || n>e);
        return n;
    }

    
}



