package Aula05.ex1;

import java.util.Scanner;


public class OpData {
    
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception{
    String op="";
    int day=0;
    int month=0;
    int year=0;

    DateYMD D = new DateYMD(1,1,1000);

    do{
        System.out.printf("%14s","Menu\n");
        System.out.println("1 - create new date");
        System.out.println("2 - show current date");
        System.out.println("3 - increment date");
        System.out.println("4 - decrement date");
        System.out.println("0 - exit");
        op=sc.next();
        switch(op){
            case "1":
                System.out.print("Dia: ");
                day=sc.nextInt();
                System.out.print("Mês: ");
                month=sc.nextInt();
                System.out.print("Ano: ");
                year=sc.nextInt();
                try{
                    D=new DateYMD(day, month, year);
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
                
                break;
            case "2":
                System.out.println(D);
                break;
            case "3":
                D.incdata();
                break;
            case "4":
                D.dedata();
                break;
            case "0":
            System.out.println("Obrigado");
            System.exit(0);
        }
    }while(!(op=="0"));
    
    }
}
